package com.example.login

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val campoEmail: EditText = findViewById(R.id.inputEmail)
        val campoPassword: EditText = findViewById(R.id.inputPassword)

        val login: Button = findViewById(R.id.button)
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
                val intent: Intent = Intent(this, Home:: class.java)
                startActivity(intent)
        }

        /*val btnLogin: Button = findViewById(R.id.button)
            btnLogin.setOnClickListener {
                val intent: Intent = Intent(this, Home:: class.java)
                startActivity(intent)
            }*/


        val btnForgotPassword: TextView = findViewById(R.id.textForgotPassword)
        btnForgotPassword.setOnClickListener {
            val intent: Intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
        }

        val btnLoginUsing: TextView = findViewById(R.id.textLoginUsing)
        btnLoginUsing.setOnClickListener {
            val intent: Intent = Intent(this, LoginLinkedin::class.java)
            startActivity(intent)
        }

        val btnRegistros: TextView = findViewById(R.id.TextDontHaveAnAcount)
        btnRegistros.setOnClickListener {
            val intent: Intent = Intent(this, registros::class.java)
            startActivity(intent)
        }

        val btnSingUpHere: TextView = findViewById(R.id.textSignUp)
        btnSingUpHere.setOnClickListener {
            val intent: Intent = Intent(this, registros::class.java)
            startActivity(intent)
        }
    }
    fun isValidEmail(str: Editable): Boolean{
        return android.util.Patterns.EMAIL_ADDRESS.matcher(str).matches()
    }
}