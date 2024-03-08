package com.example.mobileapp

import javax.inject.Inject
import android.util.Log
class AMOLEDdisplay @Inject constructor(): Display {
    override fun turnOnScreen() {
        Log.i("TAGY", "Amoled Display is created successfully")
    }
}