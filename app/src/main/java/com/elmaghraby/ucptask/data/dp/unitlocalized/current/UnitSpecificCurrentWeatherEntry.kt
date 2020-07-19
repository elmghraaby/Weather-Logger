/*
  Copyright (c) 7/19/20, Created By Ahmed Alaa Elmaghraby.
 */

package com.elmaghraby.ucptask.data.dp.unitlocalized.current

interface UnitSpecificCurrentWeatherEntry {
    val temperature: Double
    val conditionText: String
    val conditionIconUrl: String
    val windSpeed: Double
    val windDirection: String
    val precipitationVolume: Double
    val feelsLikeTemperature: Double
    val visibilityDistance: Double
}
