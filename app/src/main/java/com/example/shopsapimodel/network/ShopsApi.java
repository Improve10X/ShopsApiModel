package com.example.shopsapimodel.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ShopsApi {
    public ShopsApiService createShopsApiService() {

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://crudcrud.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        ShopsApiService shopsApiService = retrofit.create(ShopsApiService.class);
        return shopsApiService;
    }
}
