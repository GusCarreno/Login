package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TechnicalDocumentacionService : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technical_documentacion_service)

        val btnAdministrative: Button = findViewById(R.id.button1)
        btnAdministrative.setOnClickListener {
            val intent: Intent = Intent(this, AdministrativeServicesOrganization::class.java)
            startActivity(intent)
        }

        val btnDocumentMangement: Button = findViewById(R.id.button2)
        btnDocumentMangement.setOnClickListener {
            val intent: Intent = Intent(this, DocumentMangement:: class.java)
            startActivity(intent)
        }

        val btnProject: Button = findViewById(R.id.button3)
        btnProject.setOnClickListener {
            val intent: Intent = Intent(this, ProjectManagementService:: class.java)
            startActivity(intent)
        }
    }
}