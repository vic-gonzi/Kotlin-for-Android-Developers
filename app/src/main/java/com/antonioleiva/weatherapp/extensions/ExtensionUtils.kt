package com.antonioleiva.weatherapp.extensions

import java.text.DateFormat
import java.util.*

fun Long.toDateString(dateFormat: Int = DateFormat.MEDIUM, locale: Locale = Locale.getDefault()): String {
    val df = DateFormat.getDateInstance(dateFormat, locale)
    return df.format(this)
}
