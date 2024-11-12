package com.example.controledeentregas.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Financeiro(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val receita: Double,
    val despesaTotal: Double,
    val saldo: Double,
    val periodo: String
)
