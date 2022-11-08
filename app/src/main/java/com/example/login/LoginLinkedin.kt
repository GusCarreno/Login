package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginLinkedin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_linkedin)

        val campoEmail: EditText = findViewById(R.id.inputEmail)
        val campoPassword: EditText = findViewById(R.id.inputPassword)

        val login: Button = findViewById(R.id.buttonSignIn)
        login.setOnClickListener {
            if(campoEmail.text.toString()==""){
                campoEmail.error = "Email Requerido"
                return@setOnClickListener
            } else if(!isValidEmail(campoEmail.text)){
                campoEmail.error = "Email Invalido"
                return@setOnClickListener
            }else if(campoPassword.text.toString()==""){
                campoPassword.error = "Password Requerido"
                return@setOnClickListener
            }
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

        /*val btnProject: Button = findViewById(R.id.buttonSignIn)
        btnProject.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }*/
    }
    fun isValidEmail(str: Editable): Boolean{
        return android.util.Patterns.EMAIL_ADDRESS.matcher(str).matches()
    }
}