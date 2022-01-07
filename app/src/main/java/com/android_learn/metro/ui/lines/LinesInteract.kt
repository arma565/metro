package com.android_learn.metro.ui.lines

import com.android_learn.metro.api.ApiClient
import com.android_learn.metro.api.IService
import com.android_learn.metro.models.IResponseView
import com.android_learn.metro.models.Lines
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LinesInteract {

    private val service : IService = ApiClient.retrofit.create(IService::class.java)
    fun getLines(listener : IResponseView<List<Lines>>)
    {
        val callLines : Call<List<Lines>> = service.getLines()

        callLines.enqueue(object : Callback<List<Lines>>{
            override fun onResponse(call: Call<List<Lines>>, response: Response<List<Lines>>) {
                listener.onSuccess(response.body()!!)
            }

            override fun onFailure(call: Call<List<Lines>>, t: Throwable) {
                listener.onFailure(t.message.toString())
            }

        })
    }



}