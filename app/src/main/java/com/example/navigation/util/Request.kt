package com.example.navigation.util

import android.util.Log
import java.net.URL

/**
 * Created by jiali on 2019-07-26.
 */
class Request(val url : String) {
    fun run () {
        val result = URL(url).readText()
        Log.i("Request", "get url result: $result")
    }
}