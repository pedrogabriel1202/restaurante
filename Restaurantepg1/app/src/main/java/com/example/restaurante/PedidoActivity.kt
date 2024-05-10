package com.example.restaurante
//PEDRO GABRIEL
//TURMA 1202


// Importa a classe AppCompatActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// Importa a classe gerada para a atividade PedidoActivity
import com.example.restaurante.databinding.ActivityPedidoBinding

// Define a classe PedidoActivity que estende AppCompatActivity
class PedidoActivity : AppCompatActivity() {
    // Declaração da variável de vinculação para a atividade
    private lateinit var binding: ActivityPedidoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        // Cia layout da atividade usando o objeto de vinculação gerado
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        // Indica o onCreate da superclasse
        super.onCreate(savedInstanceState)
        // Define o layout da atividade para o layout inflaer
        setContentView(binding.root)


        val i = intent
        // Obtém a quantidade de pizzas e converte para Int
        val quantidadePizza = i.getStringExtra("quantidadePizza").toString().toInt()
        // Obtém a quantidade de saladas e converte para Int
        val quantidadeSalada = i.getStringExtra("quantidadeSalada").toString().toInt()
        // Obtém a quantidade de hambúrgueres e converte para Int
        val quantidadeHamburguer = i.getStringExtra("quantidadeHamburguer").toString().toInt()

        // Faz uma tela com o resumo do pedido
        val texto = "Resumo do Pedido\n" +
                "Pizza: $quantidadePizza Preço: ${quantidadePizza*8}\n" +
                "Salada: $quantidadeSalada Preço: ${quantidadeSalada*10}\n" +
                "Hamburguer: $quantidadeHamburguer Preço: ${quantidadeHamburguer*12}\n"

        // Define o texto do TextView no layout usando a string construída
        binding.textResumo.text = texto
    }
}