package com.example.shopsapimodel;

import com.google.gson.annotations.SerializedName;

import java.security.PublicKey;
import java.util.ArrayList;

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

    @SerializedName("current_total_duties_set")
    private String totalDutiesSet;

    @SerializedName("current_total_price")
    private String currentTotalPrice;

    @SerializedName("current_total_price_set")
    public PriceSet priceSet2;

    @SerializedName("current_total_tax")
    private String currentTotalTax;

    @SerializedName("current_total_tax_set")
    public PriceSet priceSet3;

    @SerializedName("customer_locale")
    private String locale;

    @SerializedName("device_id")
    private String deviceId;

    @SerializedName("discount_codes")
    private ArrayList<String> discountCodes;

    @SerializedName("estimated_taxes")
    private boolean estimatedTaxes;

    @SerializedName("financial_status")
    private String financialTaxes;

    @SerializedName("fulfillment_status")
    private String fulFillmentStatus;

    @SerializedName("gateway")
    private String gateway;

    @SerializedName("landing_site")
    private String landingSite;

    @SerializedName("landing_site_ref")
    private String landingSiteRef;

    @SerializedName("location_id")
    private String locationId;

    private String name;

    private String note;

    @SerializedName("note_attributes")
    private ArrayList<String> noteAttributes;

    private String number;

    @SerializedName("order_number")
    private Integer orderNumber;


    @SerializedName("order_status_url")
    private String orderStatusUrl;

    @SerializedName("original_total_duties_set")
    private String originalTotal;

    @SerializedName("payment_gateway_names")
    private ArrayList<String> paymentGateWayNames;

    @SerializedName("presentment_currency")
    private String presentmentCurrency;

    @SerializedName("processed_at")
    private String processedAt;

    @SerializedName("processing_method")
    private String processingMethod;

    @SerializedName("reference")
    private String reference;

    @SerializedName("referring_site")
    private String referenceSite;

    @SerializedName( "source_identifier")
    private String sourceIdentifier;

    @SerializedName("source_name")
    private String sourceName;

    @SerializedName("source_url")
    private String sourceUrl;

    @SerializedName("subtotal_price")
    private String subtotalPrice;


    @SerializedName("subtotal_price_set")
    public PriceSet priceSet4;

    @SerializedName("tags")
    private String tags;

    @SerializedName("taxes_included")
    private boolean taxesIncluded;

    @SerializedName("test")
    private boolean test;

    @SerializedName("token")
    private String token;

    @SerializedName("total_discounts")
    private String totalDiscounts;

    @SerializedName("total_discounts_set")
    public PriceSet priceSet5;

    @SerializedName("total_line_items_price")
    private String totalLineItemsPrice;

    @SerializedName("total_line_items_price_set")
    public PriceSet priceSet6;

    @SerializedName("total_outstanding")
    private String totalOutstanding;

    @SerializedName("total_price")
    private String totalPrice;

    @SerializedName("total_price_set")
    public PriceSet priceSet7;

    @SerializedName("total_price_usd")
    private String totalPriceUsd;

    @SerializedName("total_shipping_price_set")
    public PriceSet priceSet8;

    @SerializedName("total_tax")
    private String totalTax;

    @SerializedName("total_tax_set")
    public PriceSet priceSet9;

    @SerializedName("total_tip_received")
    private String totalTipReceived;

//    "total_tip_received": "0.00",
//            "total_weight": 0,
//            "updated_at": "2022-07-10T22:50:46+00:00",
//            "user_id": null,
//            "discount_applications": [],
//            "fulfillments": [],


}
