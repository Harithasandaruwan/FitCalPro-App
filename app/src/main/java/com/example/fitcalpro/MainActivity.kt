package com.example.fitcalpro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Make system bars transparent
        WindowInsetsControllerCompat(window, window.decorView).apply {
            isAppearanceLightStatusBars = true // Optional: Light status bar icons
            isAppearanceLightNavigationBars = true // Optional: Light navigation bar icons
            hide(WindowInsetsCompat.Type.statusBars() or WindowInsetsCompat.Type.navigationBars())
            systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

        //Get started button navigate
        var buttontwo = findViewById<Button>(R.id.button_get_st)
        buttontwo.setOnClickListener {
            val intent2 = Intent(this, page21::class.java)
            startActivity(intent2)
        }
    }
}