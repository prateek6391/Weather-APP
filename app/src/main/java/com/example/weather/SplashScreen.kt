package com.example.weather

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*
        // with time delay
        var time : Long = 2000
        Handler().postDelayed({
            var intent = Intent(SplashScreen@this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, time)    */

        //  without time delay
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}