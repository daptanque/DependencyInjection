package com.example.mobileapp

import android.util.Log
import javax.inject.Inject

class Mobile @Inject constructor(
        val batery: Battery,
    val simCard: SimCard,
    val display: Display
) {

    init{
        batery.displayBatteryPower()
        simCard.connectToNetwork()
        display.turnOnScreen()

        Log.i("TAGY", "Mobile is created Successfully")
    }

    fun turnOnMobile(){
        Log.i("TAGY", "Mobile is turned ON")
    }

}