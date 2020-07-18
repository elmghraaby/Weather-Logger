/******************************************************************************
 *  Copyright (c) 2020, Created By Ahmed Alaa Elmaghraby.                     *
 ******************************************************************************/

package com.elmaghraby.ucptask.data.dp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.elmaghraby.ucptask.data.dp.entity.WEATHER_LOCATION_ID
import com.elmaghraby.ucptask.data.dp.entity.WeatherLocation


@Dao
interface WeatherLocationDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherLocation: WeatherLocation)

    @Query("select * from weather_location where id = $WEATHER_LOCATION_ID")
    fun getLocation(): LiveData<WeatherLocation>

    @Query("select * from weather_location where id = $WEATHER_LOCATION_ID")
    fun getLocationNonLive(): WeatherLocation?
}
