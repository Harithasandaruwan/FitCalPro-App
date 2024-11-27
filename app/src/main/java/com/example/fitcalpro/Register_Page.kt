package com.example.fitcalpro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Register_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register_page)

        val fname: EditText = findViewById(R.id.fname)
        val lname: EditText = findViewById(R.id.lname)
        val mail: EditText = findViewById(R.id.email)
        val pass: EditText = findViewById(R.id.password)
        val Cpass: EditText = findViewById(R.id.cpass)
        val loginButton: Button = findViewById(R.id.button_reg)

        loginButton.setOnClickListener {
            val firstName = fname.text.toString().trim()
            val lastName = lname.text.toString().trim()
            val Email = mail.text.toString().trim()
            val Password = pass.text.toString().trim()
            val CPassword = Cpass.text.toString().trim()

            if (firstName.isEmpty() || lastName.isEmpty() || Email.isEmpty() || Password.isEmpty() || CPassword.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, Home_Page::class.java)
                startActivity(intent)
                // Optionally, finish the current activity so the user can't navigate back
                finish()
            }
        }
    }
}