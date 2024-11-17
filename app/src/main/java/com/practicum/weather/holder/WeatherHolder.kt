package com.practicum.weather.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.practicum.weather.R
import com.practicum.weather.model.WhatTheWeatherToday

class WeatherHolder(item: View): RecyclerView.ViewHolder(item) {

    private val ourObject = item.findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.fullBlock)
    private val blockName = item.findViewById<TextView>(R.id.nameOfTheDay)
    private val picture = item.findViewById<ImageView>(R.id.isItCloud)
    private val blockTemperature = item.findViewById<TextView>(R.id.temperature)

    fun bind(weather: WhatTheWeatherToday){
        val title = weather.nameOfTheDay
        val image = if (weather.isItCloud == true) R.drawable.rainy else R.drawable.sun
        val temp = weather.temperature
        val backgroundColor = when {
            temp <= -25 -> R.color.super_cold
            temp in -24..-10 -> R.color.cold
            temp in -9..5 -> R.color.a_bit_cold
            temp in 6..15 -> R.color.a_bit_warm
            temp in 15..25 -> R.color.warm
            temp > 25 -> R.color.super_warm
            else -> R.color.white
        }

        ourObject.setBackgroundResource(backgroundColor)
        blockName.text = title
        picture.setImageResource(image)
        blockTemperature.text = temp.toString()

    }

}