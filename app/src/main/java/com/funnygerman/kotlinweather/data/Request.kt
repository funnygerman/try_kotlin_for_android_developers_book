package com.funnygerman.kotlinweather.data

import android.util.Log
import java.net.URL

/**
 * Created by timur on 05.11.17.
 */
class Request(private val url: String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}