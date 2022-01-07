package com.android_learn.metro.ui.stations

import com.android_learn.metro.api.ApiClient
import com.android_learn.metro.api.IService
import com.android_learn.metro.models.IResponseView
import com.android_learn.metro.models.Stations
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StationInteract {


    private val service : IService = ApiClient.retrofit.create(IService::class.java)
    fun getStations(id : String , listener : IResponseView<List<Stations>>)
    {
        val callStations : Call<List<Stations>> = service.getStations(id)

        callStations.enqueue(object : Callback<List<Stations>>{
            override fun onResponse(
                call: Call<List<Stations>>,
                response: Response<List<Stations>>
            ) {
                listener.onSuccess(response.body()!!)
            }

            override fun onFailure(call: Call<List<Stations>>, t: Throwable) {
                listener.onFailure(t.message.toString())
            }

        })
    }



}