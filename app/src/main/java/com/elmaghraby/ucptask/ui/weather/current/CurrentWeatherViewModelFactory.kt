/*
  Copyright (c) 7/19/20, Created By Ahmed Alaa Elmaghraby.
 */
package com.elmaghraby.ucptask.ui.weather.current

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.elmaghraby.ucptask.data.provider.UnitProvider
import com.elmaghraby.ucptask.data.repository.ForecastRepository

class CurrentWeatherViewModelFactory(
    private val forecastRepository: ForecastRepository,
    private val unitProvider: UnitProvider
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CurrentWeatherViewModel(
            forecastRepository,
            unitProvider
        ) as T
    }
}
