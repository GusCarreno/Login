package com.example.login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class registros : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registros)

        val btnRegistroLinkedin: Button = findViewById(R.id.buttonSignUpLinkedin)
        btnRegistroLinkedin.setOnClickListener {
            val intent: Intent = Intent(this, RegistroLinkedin:: class.java)
            startActivity(intent)
        }

        val btnRegistroEmail: Button = findViewById(R.id.buttonSignUpEmail)
        btnRegistroEmail.setOnClickListener {
            val intent: Intent = Intent(this, registroEmail:: class.java)
            startActivity(intent)
        }

        val btnHaveAccount: TextView = findViewById(R.id.textHaveAnAccount)
        btnHaveAccount.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

        val btnLoginHere: TextView = findViewById(R.id.textLoginHere)
        btnLoginHere.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
    }
}