package com.example.shopsapimodel;

import com.google.gson.annotations.SerializedName;

public class ClientDetails {
    @SerializedName("accept_language")
    private String acceptLanguage;
    @SerializedName("browser_height")
    private Integer height;
    @SerializedName("browser_ip")
    private String ip;
    @SerializedName("browser_width")
    private String browserWidth;
    @SerializedName("session_hash")
    private String sessionHash;
    @SerializedName("user_agent")
    private String userAgent;
}
