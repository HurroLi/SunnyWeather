package com.example.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication:Application() {


    companion object{
        @SuppressLint("StaticFieldLake")
        lateinit var context:Context
        const val TOKEN = "xvY1IboR0eyz8M5c"
    }


    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }



}