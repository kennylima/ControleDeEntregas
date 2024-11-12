package com.example.controledeentregas.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.controledeentregas.data.dao.ClienteDao
import com.example.controledeentregas.data.models.Cliente
import com.example.controledeentregas.data.models.Viagem
import com.example.controledeentregas.data.models.Despesa
import com.example.controledeentregas.data.models.Financeiro

@Database(entities = [Cliente::class, Viagem::class, Despesa::class, Financeiro::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun clienteDao(): ClienteDao
    abstract fun viagemDao(): ViagemDao
    abstract fun despesaDao(): DespesaDao
}