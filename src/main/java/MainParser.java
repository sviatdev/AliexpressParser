import com.google.gson.Gson;
import entity.Product;
import entity.Results;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainParser {
    public static String FILENAME = "products.csv";
    public static String trimmedStr = "/\\*\\*/jQuery.*\\w\\(";
    private static Pattern pattern = Pattern.compile(trimmedStr);
    private static Gson gson = new Gson();
    private static List<String> itemsList = new ArrayList<>();

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            String request = sendRequest(i);
            addItemsToArray(request);
        }
        saveToFile(FILENAME);
        System.out.println("Items received. Check file products.csv");
    }

    private static void addItemsToArray(String request) {
        Product product = handleItemsAndConvertFromJSON(request);
        if (product != null) {
            List<Results> results = product.getResults();
            for (Results result : results) {
                itemsList.add(result.toString());
            }
        }
        System.out.println("Added items to array");
    }

    private static void saveToFile(String filename) {
        File file = new File(filename);
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (String str : itemsList) {
                printWriter.println(str);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println("Saved to products.csv");
    }

    private static String sendRequest(int count) {
        HttpGet getConnection = new HttpGet("https://gpsfront.aliexpress.com/getRecommendingResults.do?callback=jQuery18308651937148592963_1618481732718&widget_id=5547572&platform=pc&limit=10&offset="+count*10+"&phase=1&productIds2Top=&postback=1618481735088");
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(getConnection)) {
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new IOException("Status code: 200 \nError while try to connect");
            }
            if (response.getEntity() != null) {
                return EntityUtils.toString(response.getEntity());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";

    }

    public static Product handleItemsAndConvertFromJSON(String items) {
        StringBuilder stringBuilder = new StringBuilder(items);
        stringBuilder.setLength(stringBuilder.length() - 2);
        Matcher matcher = pattern.matcher(items);
        if (matcher.find()) {
            stringBuilder.replace(matcher.start(), matcher.end(), "");
            System.out.println("Converted from Json to object");
            return gson.fromJson(stringBuilder.toString(), Product.class);
        } else {
            System.out.println("Input data error!");
            return null;
        }
    }
}
