/*
  Copyright (c) 7/19/20, Created By Ahmed Alaa Elmaghraby.
 */

package com.elmaghraby.ucptask.data.provider

import android.content.Context
import com.elmaghraby.ucptask.internal.UnitSystem

const val UNIT_SYSTEM = "UNIT_SYSTEM"

class UnitProviderImpl(context: Context) : PreferenceProvider(context), UnitProvider {

    override fun getUnitSystem(): UnitSystem {
        val selectedName = preferences.getString(UNIT_SYSTEM, UnitSystem.METRIC.name)
        return UnitSystem.valueOf(selectedName!!)
    }
}
