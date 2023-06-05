package com.example.shopsapimodel;

import com.google.gson.annotations.SerializedName;

import java.security.PublicKey;

public class Shops {
    @SerializedName("_id")
    private String serverId;
    private Integer id;
    @SerializedName("admin_graphql_api_id")
    private String imageUrl;
    @SerializedName("app_id")
    private Integer appId;
    @SerializedName("browser_ip")
    private String browserIp;
    @SerializedName("buyer_accepts_marketing")
    private boolean buyerAccepts;
    @SerializedName("cancel_reason")
    private String cancelReason;
    @SerializedName("cancelled_at")
    private String cancelledAt;
    @SerializedName("cart_token")
    private String cartToken;
    @SerializedName("checkout_id")
    private Integer checkOutId;
    @SerializedName("checkout_token")
    private String checkOutToken;

    @SerializedName("client_details")
    public ClientDetails clientDetails;

    @SerializedName("closed_at")
    private String closedAt;
    @SerializedName("confirmed")
    private boolean confirmed;
    @SerializedName("currency")
    private String currency;
    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("current_subtotal_price_set")
    public PriceSet priceSet;

    @SerializedName("current_total_discounts")
    private String subTotalDiscounts;

    @SerializedName("current_total_discounts_set")
    public PriceSet priceSet1;




}
