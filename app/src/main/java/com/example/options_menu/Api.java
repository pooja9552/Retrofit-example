package com.example.options_menu;

import java.lang.annotation.Target;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL="https://api.myjson.com/bins/9jkhd";
    @GET("marvel")
    Call<List<Heroes>>getHeroes();
}
