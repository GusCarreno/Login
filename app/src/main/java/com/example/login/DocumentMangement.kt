package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DocumentMangement : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_document_mangement)

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

        val btnProject: Button = findViewById(R.id.button3)
        btnProject.setOnClickListener {
            val intent: Intent = Intent(this, ProjectManagementService:: class.java)
            startActivity(intent)
        }
    }
}