package com.groupproject.firstaid101

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Procedure(
    var name: String? = "",
    var steps: String? = "",
    var link: String? = ""
):Parcelable