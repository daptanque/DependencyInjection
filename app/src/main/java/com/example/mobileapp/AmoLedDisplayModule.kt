package com.example.mobileapp

import dagger.Module
import dagger.Provides

@Module
class AmoLedDisplayModule(var displayResolution: Int) {

    @Provides
    fun providesAmoledDisplay(amoleDdisplay: AMOLEDdisplay) : Display{
        return AMOLEDdisplay()
    }
}