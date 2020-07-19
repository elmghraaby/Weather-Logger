/*
  Copyright (c) 7/19/20, Created By Ahmed Alaa Elmaghraby.
 */

package com.elmaghraby.ucptask.data.repository

import androidx.lifecycle.LiveData
import com.elmaghraby.ucptask.data.dp.entity.WeatherLocation
import com.elmaghraby.ucptask.data.dp.unitlocalized.current.UnitSpecificCurrentWeatherEntry
import com.elmaghraby.ucptask.data.dp.unitlocalized.future.detail.UnitSpecificDetailFutureWeatherEntry
import com.elmaghraby.ucptask.data.dp.unitlocalized.future.list.UnitSpecificSimpleFutureWeatherEntry
import org.threeten.bp.LocalDate


interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>

    suspend fun getFutureWeatherList(startDate: LocalDate, metric: Boolean): LiveData<out List<UnitSpecificSimpleFutureWeatherEntry>>

    suspend fun getFutureWeatherByDate(date: LocalDate, metric: Boolean): LiveData<out UnitSpecificDetailFutureWeatherEntry>

    suspend fun getWeatherLocation(): LiveData<WeatherLocation>
}