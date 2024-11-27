package com.example.fitcalpro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Page_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page2)

        var button1 = findViewById<Button>(R.id.button_reg1)
        button1.setOnClickListener {
            val intent1 = Intent(this, Register_Page::class.java)
            startActivity(intent1)
        }

        var button2 = findViewById<Button>(R.id.button_log)
        button2.setOnClickListener {
            val intent2 = Intent(this, Page3_Log::class.java)
            startActivity(intent2)
        }
    }
}