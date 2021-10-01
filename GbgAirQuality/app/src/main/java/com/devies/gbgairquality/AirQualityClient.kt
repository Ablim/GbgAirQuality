package com.devies.gbgairquality

import android.widget.TextView
import okhttp3.*
import java.io.IOException

class AirQualityClient {
    fun getData(url: String) {
        val request = Request.Builder()
            .url(url)
            .get()
            .build()

        val client = OkHttpClient()
        // Use coroutines instead of callbacks
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {

            }
            override fun onResponse(call: Call, response: Response) {
                val bodyData = response.body()?.string()

                // val airText = findViewById<TextView>(R.id.airQualityText)
                // airText.setText(text)
                // val gson = GsonBuilder().create()
                // val forecast = gson.fromJson(body, Forecast::class.java)
            }
        })
    }
}