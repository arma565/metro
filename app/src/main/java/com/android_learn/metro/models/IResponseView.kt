package com.android_learn.metro.models

interface IResponseView<T> {

    fun onSuccess(data : T)
    fun onFailure(data : String)


}