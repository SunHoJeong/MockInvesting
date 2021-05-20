package com.sec.mockinvesting.stock

import com.sec.mockinvesting.stock.message.Index
import com.sec.mockinvesting.stock.message.IndexName
import com.sec.mockinvesting.stock.message.Term

interface StockManager {

    //for market activity
    fun getAllMarketIndexes(): List<Index>

    //for market detail activity
    //for chart
    fun getIndexesByTerm(indexName: IndexName, term: Term): List<Index>
    //for information
    fun getMarketIndex(indexName: IndexName): Index
    fun getMinimumIndexForYear(indexName: IndexName): Double
    fun getMaximumIndexForYear(indexName: IndexName): Double
    fun getVolume(indexName: IndexName): Long
    fun getAverageVolume(indexName: IndexName): Long
}