package com.example.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usuario = intent.extras?.getString("usuario")

        if(!username.isNullOrEmpty()){
            binding.textOla.setText("SEJA BEM VINDO $usuario")
        }

        binding.buttonFechar.setOnClickListener {
            finishAffinity()
        }
    }
}