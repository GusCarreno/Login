package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProjectManagementService : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_management_service)

        val btnAdministrative: Button = findViewById(R.id.button1)
        btnAdministrative.setOnClickListener {
            val intent: Intent = Intent(this, AdministrativeServicesOrganization:: class.java)
            startActivity(intent)
        }

        val btnTechnical: Button = findViewById(R.id.button2)
        btnTechnical.setOnClickListener {
            val intent: Intent = Intent(this, TechnicalDocumentacionService:: class.java)
            startActivity(intent)
        }

        val btnDocumentMangement: Button = findViewById(R.id.button3)
        btnDocumentMangement.setOnClickListener {
            val intent: Intent = Intent(this, DocumentMangement:: class.java)
            startActivity(intent)
        }
    }
}