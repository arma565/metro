package com.android_learn.metro.models

interface IView<T> {

    fun onSuccess(data : T)
    fun onFailure(data : String)
    fun onShowProgressBar()
    fun onHideProgressBar()

}