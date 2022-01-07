package com.android_learn.metro.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {


    private const val baseUrl : String = "https://androidsupport.ir/pack/metro/"

    val retrofit = Retrofit
        .Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


}