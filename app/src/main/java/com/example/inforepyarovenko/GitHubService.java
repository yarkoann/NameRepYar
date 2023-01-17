package com.example.inforepyarovenko;


import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GitHubService {
    @GET("search/users")
    Call<GitResult> getUsers(@Query("q") String name);

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
