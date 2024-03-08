package com.example.mobileapp

import android.util.Log
import javax.inject.Inject

//consider as a ready class - 3rd party lib
class Battery{

    init{
        Log.i("TAGY", "Battery Created")
    }

    fun displayBatteryPower(){
        Log.i("TAGY", "Battery is 100%")
    }

}