package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Infla o layout de atividade de login usando o ActivityLoginBinding
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura um ouvinte de clique para o botão de login
        binding.buttonEntrar.setOnClickListener {
            // Obtém o nome de usuário e senha dos campos de entrada e remove espaços em branco
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()

            // Verifica se o nome de usuário e a senha correspondem aos valores esperados
            if (username == "pedro" && password == "22") {
                // Se as credenciais estiverem corretas, cria uma intenção para iniciar a atividade principal
                val i = Intent(this, MainActivity::class.java)
                // Passa o nome de usuário para a atividade principal através de extras
                i.putExtra("username", username)
                // Inicia a atividade principal e encerra a atividade de login
                startActivity(i)
                finish()
            } else {
                // Se as credenciais estiverem incorretas, exibe um aviso de erro usando um Toast
                Toast.makeText(applicationContext, "Errou", Toast.LENGTH_LONG).show()
            }
        }

    }
}
