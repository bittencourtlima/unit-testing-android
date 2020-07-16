package com.bittencourt.unittesting

import android.app.Application
import com.bittencourt.unittesting.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@BaseApplication)
            modules(AppModule.module)
        }
    }
}