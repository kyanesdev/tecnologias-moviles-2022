package com.example.EjercicioKotlinPractice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.R.color.mtrl_btn_transparent_bg_color

private lateinit var welcome: TextView
private lateinit var inputEmail : EditText
private lateinit var inputUsername : EditText
private lateinit var inputPassword : EditText
private lateinit var forgotPasswordButton : Button
private lateinit var loginButton : Button
private lateinit var returnButton : Button
private lateinit var registerButton : Button
private lateinit var helpButton : Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("PrivateResource")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        forgotPasswordButton = findViewById(R.id.buttonForgottenPassword)
        forgotPasswordButton.backgroundTintList = ContextCompat.getColorStateList(this, mtrl_btn_transparent_bg_color)

        welcome = findViewById(R.id.welcomeText)
        inputEmail = findViewById(R.id.editTextEmailAddress)
        inputUsername = findViewById(R.id.editTextPersonName)
        inputPassword = findViewById(R.id.editTextTextPassword)
        loginButton = findViewById(R.id.buttonLogin)
        returnButton = findViewById(R.id.buttonReturn)
        registerButton = findViewById(R.id.buttonRegister)
        helpButton = findViewById(R.id.buttonHelp)

        welcome.visibility = View.GONE

        forgotPasswordButton.setOnClickListener() {
            var email = ""

            if(inputEmail.text.isEmpty()) {
                email = "kyanesNoReply@correo.com.ar"

            }else {
                email = inputEmail.text.toString()
            }

            Toast.makeText(baseContext, "We send an email to $email", Toast.LENGTH_LONG).show();
        }

        loginButton.setOnClickListener() {

            val contrasenia="asd"
            if(inputEmail.text.isEmpty()) {
                Toast.makeText(baseContext, "Enter your email", Toast.LENGTH_LONG).show();
            }else if(inputUsername.text.isEmpty()){
                Toast.makeText(baseContext, "Enter your username", Toast.LENGTH_LONG).show();
            }else if(inputPassword.text.isEmpty()){
                Toast.makeText(baseContext, "Enter your password", Toast.LENGTH_LONG).show();
            }else if(inputPassword.text.toString() != contrasenia){
                Toast.makeText(baseContext, "Password incorrect", Toast.LENGTH_LONG).show();
            }else{
                welcome.visibility = View.VISIBLE

                inputEmail.visibility = View.GONE
                inputUsername.visibility = View.GONE
                inputPassword.visibility = View.GONE
                loginButton.visibility = View.GONE
                registerButton.visibility = View.GONE
                helpButton.visibility = View.GONE
                forgotPasswordButton.visibility = View.GONE

            }
        }

        returnButton.setOnClickListener() {
            onBackPressed()
        }

        helpButton.setOnClickListener() {
            Toast.makeText(baseContext, "To login correctly , you need to enter the email, username and password", Toast.LENGTH_LONG).show();
        }

        registerButton.setOnClickListener() {
            Toast.makeText(baseContext, "Not finished yet", Toast.LENGTH_LONG).show();
        }


    }

}