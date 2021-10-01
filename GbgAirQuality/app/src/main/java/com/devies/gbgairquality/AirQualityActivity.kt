package com.devies.gbgairquality

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AirQualityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_air_quality)

        val url = "https://catalog.goteborg.se/rowstore/dataset/cb541050-487e-4eea-b7b6-640d58f28092"
        val client = AirQualityClient()
        client.getData(url)
    }
}