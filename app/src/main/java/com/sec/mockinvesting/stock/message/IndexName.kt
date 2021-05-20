package com.sec.mockinvesting.stock.message

import androidx.annotation.StringDef


@Retention(AnnotationRetention.SOURCE)
@StringDef(KOSPI, KOSPI_200, KOSDAQ, SNP500, NASDAQ, DJX)
annotation class IndexName

const val KOSPI = "KOSPI"
const val KOSPI_200 = "KOSPI_200"
const val KOSDAQ = "KOSDAQ"
const val SNP500 = "SNP500"
const val NASDAQ = "NASDAQ"
const val DJX = "DJX"