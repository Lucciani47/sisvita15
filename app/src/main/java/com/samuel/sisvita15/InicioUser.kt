package com.samuel.sisvita15

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class InicioUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicio_user)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener { navigateToMainMenu() }

        val btnDoTest = findViewById<Button>(R.id.btnDoTest)
        btnDoTest.setOnClickListener { navigateToTest() }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun navigateToMainMenu(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun navigateToTest(){
        val intent = Intent(this, Test::class.java)
        startActivity(intent)
    }

}