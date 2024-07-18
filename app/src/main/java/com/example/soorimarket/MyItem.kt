package com.example.soorimarket

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MyItem(
    val aId : Int,
    val aImage: Int,
    val aName: String,
    val aRegion: String,
    val aPrice: Int,
    val aInfo: String,
    val chat: Int,
    val heart: Int
) : Parcelable
