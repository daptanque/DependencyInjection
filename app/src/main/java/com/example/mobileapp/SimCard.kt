package com.example.mobileapp

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(private val serviceProvider: ServiceProvider) {


    init{
        Log.i("TAGY", "SimCard Created")
    }

    fun connectToNetwork(){
        serviceProvider.getServiceProvider()
    }
}