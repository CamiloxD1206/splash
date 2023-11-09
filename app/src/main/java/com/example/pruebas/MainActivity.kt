package com.example.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebas.databinding.ActivityHomeBinding
import com.example.pruebas.databinding.ActivityMainBinding
import com.example.pruebas.databinding.ActivityRegisterBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoLogin.setOnClickListener {
            val intent = Intent(this,ActivityHomeBinding::class.java)
            startActivity(intent)

            finish()
        }
        binding.btnGoRegister.setOnClickListener {
            val intent = Intent(this, ActivityRegisterBinding::class.java)
            startActivity(intent)
            finish()
        }
    }
}
