package com.sec.mockinvesting.stock.message

class Index(
    val indexName: IndexName,
    val index: Double,
    val time: String,
    val area: String,
    val openIndex: Double,
    val prevCloseIndex: Double,
)