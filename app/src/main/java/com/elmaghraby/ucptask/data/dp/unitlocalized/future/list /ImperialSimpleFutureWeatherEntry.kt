/******************************************************************************
 *  Copyright (c) 2020, Created By Ahmed Alaa Elmaghraby.                     *
 ******************************************************************************/

package com.elmaghraby.ucptask.data.dp.unitlocalized.future.list

import androidx.room.ColumnInfo
import org.threeten.bp.LocalDate


class ImperialSimpleFutureWeatherEntry (
    @ColumnInfo(name = "date")
    override val date: LocalDate,
    @ColumnInfo(name = "avgtempF")
    override val avgTemperature: Double,
    @ColumnInfo(name = "condition_text")
    override val conditionText: String,
    @ColumnInfo(name = "condition_icon")
    override val conditionIconUrl: String
) : UnitSpecificSimpleFutureWeatherEntry
