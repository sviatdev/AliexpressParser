package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product {
    @SerializedName("contextId")
    @Expose
    private String contextId;
    @SerializedName("success")
    @Expose
    private boolean success;
    @SerializedName("code")
    @Expose
    private int code;
    @SerializedName("results")
    @Expose
    private List<Results> results = null;
    @SerializedName("finished")
    @Expose
    private boolean finished;
    @SerializedName("page")
    @Expose
    private int page;
    @SerializedName("pageSize")
    @Expose
    private int pageSize;
    @SerializedName("postback")
    @Expose
    private String postback;
    @SerializedName("pin")
    @Expose
    private String pin;

    public List<Results> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "Product{" +
                "contextId='" + contextId + '\'' +
                ", success=" + success +
                ", code=" + code +
                ", resultsList=" + results +
                ", finished=" + finished +
                ", page=" + page +
                ", pageSize=" + pageSize +
                ", postback='" + postback + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
