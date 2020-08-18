package com.example.kotlinmessenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_login)

        login_button_login.setOnClickListener {
            val email = email_editTextTextEmailAddress_login.text.toString()
            val password = password_editTextTextPassword_login.text.toString()
        }

        back_to_registration_textView_login.setOnClickListener {
            finish()
        }
    }
}