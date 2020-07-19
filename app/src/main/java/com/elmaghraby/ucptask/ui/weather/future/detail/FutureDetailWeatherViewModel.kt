/*
  Copyright (c) 7/19/20, Created By Ahmed Alaa Elmaghraby.
 */


package com.elmaghraby.ucptask.ui.weather.future.detail

import com.elmaghraby.ucptask.data.provider.UnitProvider
import com.elmaghraby.ucptask.data.repository.ForecastRepository
import com.elmaghraby.ucptask.internal.lazyDeferred
import com.elmaghraby.ucptask.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureDetailWeatherViewModel(
    private val detailDate: LocalDate,
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getFutureWeatherByDate(detailDate, super.isMetricUnit)
    }
}
