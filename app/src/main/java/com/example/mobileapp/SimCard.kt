package com.example.mobileapp

import android.util.Log

class SimCard() {
    private lateinit var serviceProvider:ServiceProvider

    fun setServiceProvider(serviceProvider: ServiceProvider){
        this.serviceProvider=serviceProvider
    }


    init{
        Log.i("TAGY", "SimCard Created")
    }

    fun connectToNetwork(){
        serviceProvider.getServiceProvider()
    }
}