package com.jj.a3sidedcube.domain

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Sprites(
    val back_default: String,
    val back_shiny: String,
    val front_default: String,
    val front_shiny: String
) : Parcelable