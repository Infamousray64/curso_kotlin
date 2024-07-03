package com.example.myapplication.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import android.util.Log
import android.content.Intent

class FirtsAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firts_app);
        val btnLogin = findViewById<AppCompatButton>(R.id.btnLogin);
        val etUser = findViewById<AppCompatEditText>(R.id.etUser);
        val etPassword = findViewById<AppCompatEditText>(R.id.etPassword);

        btnLogin.setOnClickListener {
            val user = etUser.text.toString()

            if (user.isNotEmpty()) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_USER", user)
                startActivity(intent)

            } else {
                Log.i("Ray", "Ingrese usuario ${etUser.text}")
            }

            val password = etPassword.text.toString()

            if (password.isNotEmpty()) {
                Log.i("Ray", "Password ingresado ${etPassword.text}")


            } else {
                Log.i("Ray", "ingrese contraseña ${etPassword.text}")
            }
        }
    }
}
