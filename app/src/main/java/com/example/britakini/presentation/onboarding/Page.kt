package com.example.britakini.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.britakini.R

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val image:Int
)

val pages = listOf(
    Page(
        title = "Haloo Sobat Britakini",
        description = "Pengalaman luar biasa dalam mendapat berita dengan BritaKini",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Haloo Sobat Britakini",
        description = "Pengalaman luar biasa dalam mendapat berita dengan BritaKini",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Haloo Sobat Britakini",
        description = "Pengalaman luar biasa dalam mendapat berita dengan BritaKini",
        image = R.drawable.onboarding3
    ),
)
