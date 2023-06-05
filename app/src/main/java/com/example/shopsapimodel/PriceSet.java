package com.example.shopsapimodel;

import com.google.gson.annotations.SerializedName;

public class PriceSet {

    @SerializedName("shop_money")
    public Money shopMoney;
    @SerializedName("presentment_money")
    public Money presentmentMoney;
}
