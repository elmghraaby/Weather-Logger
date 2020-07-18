/******************************************************************************
 *  Copyright (c) 2020, Created By Ahmed Alaa Elmaghraby.                     *
 ******************************************************************************/

package com.elmaghraby.ucptask.ui.weather.future.list

import com.elmaghraby.ucptask.data.provider.UnitProvider
import com.elmaghraby.ucptask.data.repository.ForecastRepository
import com.elmaghraby.ucptask.internal.lazyDeferred
import com.elmaghraby.ucptask.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureListWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}
