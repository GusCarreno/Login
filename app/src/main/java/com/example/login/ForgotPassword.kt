package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val btnProject: TextView = findViewById(R.id.textSignUp)
        btnProject.setOnClickListener {
            val intent: Intent = Intent(this, registros:: class.java)
            startActivity(intent)
        }

        val btnDontHaveAccount: TextView = findViewById(R.id.TextDontHaveAnAcount)
        btnDontHaveAccount.setOnClickListener {
            val intent: Intent = Intent(this, registros:: class.java)
            startActivity(intent)
        }
    }
}