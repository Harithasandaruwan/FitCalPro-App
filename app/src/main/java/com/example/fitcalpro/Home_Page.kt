package com.example.fitcalpro

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class Home_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)

        // Make the status bar transparent without affecting the bottom navigation bar
        window.apply {
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            statusBarColor = Color.TRANSPARENT
            // Keep the navigation bar color intact
        }

        navigationView = findViewById(R.id.bottom_navigation_bar)

        supportFragmentManager.beginTransaction().replace(R.id.h_main, Dashboard()).commit()
        navigationView.selectedItemId = R.id.dashboard

        navigationView.setOnNavigationItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.dashboard -> fragment = Dashboard()
                R.id.food -> fragment = Food_Fragment()
                R.id.search -> fragment = Search_Fragment()
                R.id.more -> fragment = More_Fragment()
            }

            fragment?.let {
                supportFragmentManager.beginTransaction().replace(R.id.h_main, it).commit()
            }

            true
        }
    }
    }
}