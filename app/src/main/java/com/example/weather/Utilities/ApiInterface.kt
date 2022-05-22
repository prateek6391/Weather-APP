package com.example.weather.Utilities

import com.example.weather.POJO.ModelClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("weather")
    fun getCurrentWeatherData(
        @Query("lat") latitude:String,
        @Query("lon") longitude:String,
        @Query("appid") API_KEY:String,
    ):Call<ModelClass>

    @GET("weather")
    fun getCityWeatherData(
        @Query("q") cityName:String,
        @Query("appid") API_KEY:String,
    ):Call<ModelClass>
}