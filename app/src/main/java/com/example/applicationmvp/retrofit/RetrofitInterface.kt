package com.example.applicationmvp.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {
    @GET("data/2.5/onecall")
    fun getOneCallAPI(@Query("appid") apiKey : String,
                      @Query("lat")   lat    : String,
                      @Query("lon")   lon    : String, ): Call<ResponseDateOneCall>
}