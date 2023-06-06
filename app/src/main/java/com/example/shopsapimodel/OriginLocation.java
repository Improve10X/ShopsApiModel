package com.example.shopsapimodel;

import com.google.gson.annotations.SerializedName;

public class OriginLocation {
    private Integer id;
    @SerializedName("country_code")
    private String countryCode;
    @SerializedName("province_code")
    private String provinceCode;
    private String name;
    private String address1;
    private String address2;
    private String city;
    private String zip;
}
