package com.example.myapplication
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent
import com.example.myapplication.firstapp.FirtsAppActivity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludo = findViewById<Button>(R.id.btnSaludo)
        btnSaludo.setOnClickListener { navigateToSaludo() }
        }

    fun navigateToSaludo() {
        val intent = Intent(this, FirtsAppActivity::class.java)
        startActivity(intent)
    }
}
