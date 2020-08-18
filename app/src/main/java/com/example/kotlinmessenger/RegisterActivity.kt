package com.example.kotlinmessenger

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_register)

        register_button_register.setOnClickListener {
            val email = email_editTextTextEmailAddress_register.text.toString()
            val password = password_editTextTextPassword_register.text.toString()
        }

        back_to_registration_textView_login.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}