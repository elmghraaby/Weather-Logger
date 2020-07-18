/******************************************************************************
 *  Copyright (c) 2020, Created By Ahmed Alaa Elmaghraby.                     *
 ******************************************************************************/

package com.elmaghraby.ucptask.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.elmaghraby.ucptask.data.provider.UnitProvider
import com.elmaghraby.ucptask.data.repository.ForecastRepository
import com.elmaghraby.ucptask.internal.lazyDeferred
import com.elmaghraby.ucptask.ui.base.WeatherViewModel

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(super.isMetricUnit)
    }
}
