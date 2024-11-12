package com.example.controledeentregas.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Despesa(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val tipoDespesa: String,
    val valor: Double,
    val viagemId: Int,
    val data: String
)
