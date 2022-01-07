package com.android_learn.metro.api

import com.android_learn.metro.models.Lines
import com.android_learn.metro.models.Stations
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface IService {


    @GET("getLines.php")
    fun getLines(): Call<List<Lines>>

    @FormUrlEncoded
    @POST("getStations.php")
    fun getStations(@Field("id") id : String) : Call<List<Stations>>


}