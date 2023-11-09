package com.example.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebas.databinding.ActivityHomeBinding
import com.example.pruebas.databinding.ActivityMainBinding

class Home_Activity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoLogout.setOnClickListener{
            val intent=Intent(this,ActivityMainBinding::class.java)
            startActivity(intent)
            finish()
        }
    }
}