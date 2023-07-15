package com.example.lightswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val lightToggle = findViewById<Button>(R.id.LightToggleButton)
        var lightOn = false


        lightToggle.setOnClickListener{
            // turn on flashlight here
        }
    }
}