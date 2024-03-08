package com.example.mobileapp

import android.app.Application

class MobileApplication : Application() {

    lateinit var mobile: MobileComponent

    override fun onCreate() {
        mobile = initDagger()
        super.onCreate()
    }

    private fun initDagger() : MobileComponent =
        DaggerMobileComponent.builder()
               .amoLedDisplayModule(AmoLedDisplayModule(1920))
               .build()
}