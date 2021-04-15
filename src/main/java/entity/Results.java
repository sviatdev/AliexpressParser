package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Results {
    @SerializedName("productId")
    @Expose
    private long productId;
    @SerializedName("sellerId")
    @Expose
    private long sellerId;
    @SerializedName("oriMinPrice")
    @Expose
    private String oriMinPrice;
    @SerializedName("oriMaxPrice")
    @Expose
    private String oriMaxPrice;
    @SerializedName("promotionId")
    @Expose
    private long promotionId;
    @SerializedName("startTime")
    @Expose
    private long startTime;
    @SerializedName("endTime")
    @Expose
    private long endTime;
    @SerializedName("phase")
    @Expose
    private int phase;
    @SerializedName("productTitle")
    @Expose
    private String productTitle;
    @SerializedName("minPrice")
    @Expose
    private String minPrice;
    @SerializedName("maxPrice")
    @Expose
    private String maxPrice;
    @SerializedName("discount")
    @Expose
    private String discount;
    @SerializedName("totalStock")
    @Expose
    private String totalStock;
    @SerializedName("stock")
    @Expose
    private String stock;
    @SerializedName("orders")
    @Expose
    private String orders;
    @SerializedName("soldout")
    @Expose
    private boolean soldout;
    @SerializedName("productImage")
    @Expose
    private String productImage;
    @SerializedName("productDetailUrl")
    @Expose
    private String productDetailUrl;
    @SerializedName("trace")
    @Expose
    private String trace;
    @SerializedName("totalTranpro3")
    @Expose
    private String totalTranpro3;
    @SerializedName("productPositiveRate")
    @Expose
    private String productPositiveRate;
    @SerializedName("productAverageStar")
    @Expose
    private String productAverageStar;
    @SerializedName("itemEvalTotalNum")
    @Expose
    private long itemEvalTotalNum;
    @SerializedName("gmtCreate")
    @Expose
    private long gmtCreate;


    @Override
    public String toString() {
        return "Results{" +"\n" +
                "productId=" + productId + "\n" +
                "sellerId=" + sellerId +"\n" +
                "oriMinPrice=" + oriMinPrice + "\n" +
                "oriMaxPrice=" + oriMaxPrice + "\n" +
                "promotionId=" + promotionId + "\n" +
                "startTime=" + startTime + "\n" +
                "endTime=" + endTime + "\n" +
                "phase=" + phase + "\n" +
                "productTitle=" + productTitle + "\n" +
                "minPrice=" + minPrice + "\n" +
                "maxPrice=" + maxPrice + "\n" +
                "discount=" + discount + "\n" +
                "totalStock=" + totalStock + "\n" +
                "stock=" + stock + "\n" +
                "orders=" + orders + "\n" +
                "soldout=" + soldout + "\n" +
                "productImage=" + productImage + "\n" +
                "productDetailUrl=" + productDetailUrl + "\n" +
                "trace=" + trace + "\n" +
                "totalTranpro3=" + totalTranpro3 + "\n" +
                "productPositiveRate=" + productPositiveRate + "\n" +
                "productAverageStar=" + productAverageStar + "\n" +
                "itemEvalTotalNum=" + itemEvalTotalNum + "\n" +
                "gmtCreate=" + gmtCreate + "\n" +
                '}';
    }
}
