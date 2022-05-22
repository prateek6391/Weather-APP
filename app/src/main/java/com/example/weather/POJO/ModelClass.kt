package com.example.weather.POJO

import com.google.gson.annotations.SerializedName

data class ModelClass (

    @SerializedName("weather") val weather:List<Weather>,
    @SerializedName("main") val main:Main,
    @SerializedName("wind") val windr:Wind,
    @SerializedName("sys") val sys:Sys,
    @SerializedName("id") val id:Int,
    @SerializedName("wname") val name:String

        )