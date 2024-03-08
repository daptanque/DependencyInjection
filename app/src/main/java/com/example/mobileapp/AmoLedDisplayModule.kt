package com.example.mobileapp

import dagger.Module
import dagger.Provides

@Module
class AmoLedDisplayModule {

    @Provides
    fun providesAmoledDisplay(amoleDdisplay: AMOLEDdisplay) : Display{
        return AMOLEDdisplay()
    }
}