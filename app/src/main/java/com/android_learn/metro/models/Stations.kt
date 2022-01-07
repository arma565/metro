package com.android_learn.metro.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Stations(
    val CrossLine_ID: String,
    val LineId: String,
    val OrderID: String,
    val Station_Duration: String,
    val Title: String,
    val Title_English: String,
    val addr: String,
    val atm: String,
    val bus: String,
    val elevator: String,
    val escalator: String,
    val id: String,
    val latitude: String,
    val longitude: String,
    val lost: String,
    val parking: String,
    val phone: String,
    val taxi: String,
    val ticket: String,
    val water: String
) : Parcelable