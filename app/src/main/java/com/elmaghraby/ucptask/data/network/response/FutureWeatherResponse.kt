/******************************************************************************
 *  Copyright (c) 2020, Created By Ahmed Alaa Elmaghraby.                     *
 ******************************************************************************/

package com.elmaghraby.ucptask.data.network.response

import com.elmaghraby.ucptask.data.dp.entity.WeatherLocation
import com.google.gson.annotations.SerializedName

data class FutureWeatherResponse(
    @SerializedName("daily")
    val futureWeatherEntries: ForecastDaysContainer,
    val location: WeatherLocation
)
