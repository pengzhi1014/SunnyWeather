package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * Author: pz
 * Create on 2022/11/21 12:54
 */
class SunnyWeatherApplication: Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        //彩云天气token
        const val TOKEN = "YFsZHKe0EfbDcd2i"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}