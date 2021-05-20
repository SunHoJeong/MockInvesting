package com.sec.mockinvesting.stock.message

import androidx.annotation.StringDef


@Retention(AnnotationRetention.SOURCE)
@StringDef(DAY, WEEK, MONTH, YEAR, FIVE_YEAR, MAXIMUM)
annotation class Term

const val DAY = "DAY"
const val WEEK = "WEEK"
const val MONTH = "MONTH"
const val YEAR = "YEAR"
const val FIVE_YEAR = "FIVE_YEAR"
const val MAXIMUM = "MAXIMUM"