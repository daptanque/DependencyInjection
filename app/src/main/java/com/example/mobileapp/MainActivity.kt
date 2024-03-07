package com.example.mobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var mobile: Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        /**val battery = Battery()
        val simCard = SimCard()
        simCard.serviceProvider = ServiceProvider()
        val display = Display()

        val mobile = Mobile(battery, simCard, display)**/
    }

}