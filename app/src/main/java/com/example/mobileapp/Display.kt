package com.example.mobileapp

import android.util.Log
import javax.inject.Inject

class Display @Inject constructor(){

    init{
        Log.i("TAGY", "Screen Created")
    }

    fun turnOnScreen(){
        Log.i("TAGY", "Turning ON the Screen")
    }
}