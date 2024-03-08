package com.example.mobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mobile: Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        DaggerMobileComponent.create()
            .inject(this)


        mobile.turnOnMobile()





        /**val battery = Battery()
        val simCard = SimCard()
        simCard.serviceProvider = ServiceProvider()
        val display = Display()

        val mobile = Mobile(battery, simCard, display)**/
    }

}