package com.example.init_sitenews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val button = findViewById<Button>(R.id.button_3)

        button.setOnClickListener{
            val  intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}