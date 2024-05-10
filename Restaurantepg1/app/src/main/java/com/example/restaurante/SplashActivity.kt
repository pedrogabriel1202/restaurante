package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Define o layout que será exibido nesta activity
        setContentView(R.layout.activity_splash)

        // Cria um Handler para lidar com a execução de código em um determinado momento

        Handler(Looper.getMainLooper()).postDelayed({
            // Obtém a intent que iniciou esta activity
            val i = intent
            val j = Intent(this, PedidoActivity::class.java)
            j.putExtras(i)
            // Inicia a PedidoActivity
            startActivity(j)
        }, 2000)
    }
}