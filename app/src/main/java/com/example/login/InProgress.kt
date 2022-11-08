package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InProgress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_in_progress)

        val btnToView: TextView = findViewById(R.id.buttonToView)
        btnToView.setOnClickListener {
            val intent: Intent = Intent(this, ToView:: class.java)
            startActivity(intent)
        }

        val btnInProgress: TextView = findViewById(R.id.buttonInProgress)
        btnInProgress.setOnClickListener {
            val intent: Intent = Intent(this, InProgress:: class.java)
            startActivity(intent)
        }

        val btnHired: TextView = findViewById(R.id.buttonHired)
        btnHired.setOnClickListener {
            val intent: Intent = Intent(this, Hired:: class.java)
            startActivity(intent)
        }

        val btnRejected: TextView = findViewById(R.id.buttonRejected)
        btnRejected.setOnClickListener {
            val intent: Intent = Intent(this, Rejected:: class.java)
            startActivity(intent)
        }

        val btnClosed: TextView = findViewById(R.id.buttonClosed)
        btnClosed.setOnClickListener {
            val intent: Intent = Intent(this, Closed:: class.java)
            startActivity(intent)
        }
    }
}