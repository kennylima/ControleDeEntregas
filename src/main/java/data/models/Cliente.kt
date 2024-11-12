package com.example.controledeentregas.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Cliente(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nome: String,
    val cnpj: String,
    val endereco: String,
    val contato: String
)