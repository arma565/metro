package com.android_learn.metro.models


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Lines(
    val EnglishTitle: String,
    val id: String,
    val title: String
) : Parcelable




