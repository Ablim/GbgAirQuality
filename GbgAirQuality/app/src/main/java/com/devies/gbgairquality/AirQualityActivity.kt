package com.devies.gbgairquality

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AirQualityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_air_quality)



        var airText = findViewById<TextView>(R.id.airQualityText)
        airText.setText("My Awesome Text")
    }
}