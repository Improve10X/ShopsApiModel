package com.example.shopsapimodel;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.shopsapimodel.network.ShopsApi;
import com.example.shopsapimodel.network.ShopsApiService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void fetchShopItems () throws IOException {
        ShopsApi shopsApi = new ShopsApi();
        ShopsApiService shopsApiService = shopsApi.createShopsApiService();
        Call<List<Shops>> call = shopsApiService.fetchShopItems();
        List<Shops> shops = call.execute().body();
        assertNotNull(shops);
        assertFalse(shops.isEmpty());
        System.out.println(new Gson().toJson(shops));
    }
}