package com.example.composelearning1.viewpager

import androidx.annotation.DrawableRes
import com.example.composelearning1.R

data class Pager(
    @DrawableRes val image:Int,
    val des:String
)

val dataList = listOf(
    Pager(R.drawable.onboard1,"Office Furniture"),
    Pager(R.drawable.onboard2,"Relaxing Furniture"),
    Pager(R.drawable.onboard3,"Home Furniture")
)