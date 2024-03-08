package com.example.mobileapp

import dagger.Component

@Component(modules = [BatteryModule::class, AmoLedDisplayModule::class])
interface MobileComponent {
    fun getMobileInstance() : Mobile

}