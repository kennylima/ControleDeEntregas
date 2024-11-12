package com.example.controledeentregas.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Viagem(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val destino: String,
    val dataPartida: String,
    val dataChegada: String,
    val status: String,
    val clienteId: Int,
    val produto: String
)