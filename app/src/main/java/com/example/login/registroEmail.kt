package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class registroEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_email)

        val campoName: EditText = findViewById((R.id.inputName))
        val campoEmail: EditText = findViewById(R.id.inputEmail)
        val campoPassword: EditText = findViewById(R.id.inputPassword)
        val campoNameCompany: EditText = findViewById(R.id.inputNameCompany)

        val login: Button = findViewById(R.id.buttonLogin)
        login.setOnClickListener {
            if (campoName.text.toString()==""){
                campoName.error = "Nombre Requerido"
                return@setOnClickListener
            } else if(campoEmail.text.toString()==""){
                campoEmail.error = "Email Requerido"
                return@setOnClickListener
            } else if(!isValidEmail(campoEmail.text)){
                campoEmail.error = "Email Invalido"
                return@setOnClickListener
            }else if(campoPassword.text.toString()==""){
                campoPassword.error = "Password Requerido"
                return@setOnClickListener
            } else if(campoNameCompany.text.toString()==""){
                campoNameCompany.error = "Name Company Requerido"
                return@setOnClickListener
            }
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

        val btnLoginUsing: TextView = findViewById(R.id.textLoginUsing)
        btnLoginUsing.setOnClickListener {
            val intent: Intent = Intent(this, RegistroLinkedin:: class.java)
            startActivity(intent)
        }

    }
    fun isValidEmail(str: Editable): Boolean{
        return android.util.Patterns.EMAIL_ADDRESS.matcher(str).matches()
    }
}