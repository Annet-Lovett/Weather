package com.practicum.weather.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.practicum.weather.R
import com.practicum.weather.holder.WeatherHolder
import com.practicum.weather.model.WhatTheWeatherToday

class WeatherAdapter(val listOfTheDays: List<WhatTheWeatherToday>): RecyclerView.Adapter<WeatherHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.weather_item, parent, false)
        return WeatherHolder(view)
    }

    override fun getItemCount(): Int {
        return listOfTheDays.size
    }

    override fun onBindViewHolder(holder: WeatherHolder, position: Int) {
        holder.bind(listOfTheDays[position])
    }

}