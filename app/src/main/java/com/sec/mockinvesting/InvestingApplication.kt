package com.sec.mockinvesting

import android.app.Application
import com.sec.mockinvesting.common.koinModule
import org.koin.android.ext.android.startKoin

class InvestingApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(applicationContext, koinModule)
    }
}