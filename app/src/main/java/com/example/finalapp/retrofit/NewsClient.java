package com.example.finalapp.retrofit;

import com.example.finalapp.datas.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface NewsClient {
    @GET("/api-post")
    Call<List<News>> getNews();
}
