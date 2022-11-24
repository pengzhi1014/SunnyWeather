package com.sunnyweather.android.logic.model

import androidx.core.location.LocationRequestCompat.Quality
import com.google.gson.annotations.SerializedName

/**
 * Author: pz
 * Create on 2022/11/22 12:58
 */

data class RealtimeResponse(val status: String, val result: Result){
    data class Result(val realtime: Realtime)

    data class Realtime(val skycon: String, val temperature: Float,
    @SerializedName("air_quality") val airQuality: AirQuality)

    data class AirQuality(val aqi: Aqi)

    data class Aqi(val chn: Float)
}