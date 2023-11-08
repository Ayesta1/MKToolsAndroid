package com.woodland.m13v0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun openAboutUs(view: View){
        val intent = Intent(this, AboutUs::class.java)
        startActivity(intent)

    }


            data class Info(val combinations:String="", val pices:String ="",val items:String="", val aboutUs:String ="")
    var info:Info=Info("combinaciones","piezas", "items","about us")




}
