package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AdministrativeServicesOrganization : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_administrative_services_organization)

        val btnDocumentManagement: Button = findViewById(R.id.button1)
        btnDocumentManagement.setOnClickListener {
            val intent: Intent = Intent(this, DocumentMangement:: class.java)
            startActivity(intent)
        }

        val btnTechnical: Button = findViewById(R.id.button2)
        btnTechnical.setOnClickListener {
            val intent: Intent = Intent(this, TechnicalDocumentacionService:: class.java)
            startActivity(intent)
        }

        val btnProject: Button = findViewById(R.id.button3)
        btnProject.setOnClickListener {
            val intent: Intent = Intent(this, ProjectManagementService:: class.java)
            startActivity(intent)
        }
    }
}