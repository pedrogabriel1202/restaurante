package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            val usuario = binding.editUsuario.text.toString().trim()
            val senha = binding.editSenha.text.toString().trim()

            if (usuario.equals("pedro") && senha.equals("22")) {
                val i = Intent(this, MainActivity::class.java)
                i.putExtra("usuario", username)
                startActivity(i)
                finish()
            } else {
                Toast.makeText(applicationContext, "Erro", Toast.LENGTH_LONG).show()
            }
        }

    }
}