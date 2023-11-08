package com.woodland.m13v0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        val textViewAboutUs = findViewById<TextView>(R.id.about_us)
        val stringAboutUs: String = getString(R.string.about_us)

        textViewAboutUs.setText(stringAboutUs)

    }
}