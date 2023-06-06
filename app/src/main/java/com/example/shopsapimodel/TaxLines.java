package com.example.shopsapimodel;

import com.google.gson.annotations.SerializedName;

public class TaxLines {

    @SerializedName("channel_liable")
    private Boolean channelLiable;
    private String price;
    @SerializedName("price_set")
    private PriceSet priceSet;
    private Float rate;
    private String title;
}
