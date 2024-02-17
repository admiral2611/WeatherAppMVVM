package com.admiral26.weatherappmvvm.util

import android.view.View
import android.widget.ImageView
import androidx.core.view.isGone
import com.bumptech.glide.Glide

const val api_key = "abc250afba9c435489b60858241702"
const val base_url = "https://api.weatherapi.com/"

fun ImageView.iconFor(url:String){
    Glide.with(this.context)
        .load("https:${url}")
        .into(this)
}



fun View.gone(){
    this.isGone = true
}