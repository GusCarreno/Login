package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import android.widget.Button
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.Navigation
import org.w3c.dom.Text as Text1

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnSeeAllPositions: TextView = findViewById(R.id.textView)
        btnSeeAllPositions.setOnClickListener {
            val intent: Intent = Intent(this, ToView:: class.java)
            startActivity(intent)
        }

        val btnDocumentManagement: Button = findViewById(R.id.button1)
        btnDocumentManagement.setOnClickListener {
            val intent: Intent = Intent(this, DocumentMangement:: class.java)
            startActivity(intent)
        }

        val btnAdministrative: Button = findViewById(R.id.button2)
        btnAdministrative.setOnClickListener {
            val intent: Intent = Intent(this, AdministrativeServicesOrganization:: class.java)
            startActivity(intent)
        }

        val btnTechnical: Button = findViewById(R.id.button3)
        btnTechnical.setOnClickListener {
            val intent: Intent = Intent(this, TechnicalDocumentacionService:: class.java)
            startActivity(intent)
        }

        val btnProjectManagement: Button = findViewById(R.id.button4)
        btnProjectManagement.setOnClickListener {
            val intent: Intent = Intent(this, ProjectManagementService:: class.java)
            startActivity(intent)
        }

    }
}