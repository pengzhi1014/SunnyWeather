package com.sunnyweather.android.logic.model

/**
 * Author: pz
 * Create on 2022/11/22 13:12
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily) {
}