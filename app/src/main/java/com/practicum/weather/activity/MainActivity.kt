package com.practicum.weather.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.practicum.weather.R
import com.practicum.weather.model.WhatTheWeatherToday
import com.practicum.weather.adapter.WeatherAdapter

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherAdapter = WeatherAdapter(listOf(
            WhatTheWeatherToday("Пн", true, -15),
            WhatTheWeatherToday("Вт", false, 10),
            WhatTheWeatherToday("Ср", true, -31),
            WhatTheWeatherToday("Чт", true, -5),
            WhatTheWeatherToday("Пт", false, 35),
            WhatTheWeatherToday("Сб", false, 17),
            WhatTheWeatherToday("Вс", true, -19)
            ))

        val recyclerViewWeather = findViewById<RecyclerView>(R.id.recyclerWeather)

        recyclerViewWeather.adapter = weatherAdapter

        val exampleButton = findViewById<Button>(R.id.example)

        exampleButton.setOnClickListener {
            val exampleIntent= Intent(this, Example::class.java)
            startActivity(exampleIntent)

        }

        val apiButton = findViewById<Button>(R.id.apiExample)

        apiButton.setOnClickListener {
            val apiIntent= Intent(this, WeatherActivity::class.java)
            startActivity(apiIntent)

        }


    }
}