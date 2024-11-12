package com.example.controledeentregas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.controledeentregas.ui.ClienteActivity
import com.example.controledeentregas.ui.ViagemActivity
import com.example.controledeentregas.ui.FinanceiroActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configuração de botões para abrir as atividades de Cliente, Viagem e Financeiro
        findViewById<Button>(R.id.btnCliente).setOnClickListener {
            startActivity(Intent(this, ClienteActivity::class.java))
        }
        findViewById<Button>(R.id.btnViagem).setOnClickListener {
            startActivity(Intent(this, ViagemActivity::class.java))
        }
        findViewById<Button>(R.id.btnFinanceiro).setOnClickListener {
            startActivity(Intent(this, FinanceiroActivity::class.java))
        }
    }
}