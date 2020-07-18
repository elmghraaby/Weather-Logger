/******************************************************************************
 *  Copyright (c) 2020, Created By Ahmed Alaa Elmaghraby.                     *
 ******************************************************************************/

package com.elmaghraby.ucptask.data.dp.unitlocalized.future.detail

import org.threeten.bp.LocalDate


interface UnitSpecificDetailFutureWeatherEntry {
    val date: LocalDate
    val maxTemperature: Double
    val minTemperature: Double
    val avgTemperature: Double
    val conditionText: String
    val conditionIconUrl: String
    val maxWindSpeed: Double
    val totalPrecipitation: Double
    val avgVisibilityDistance: Double
    val uv: Double
}
