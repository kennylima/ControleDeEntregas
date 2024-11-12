package com.example.controledeentregas.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.controledeentregas.data.models.Cliente

@Dao
interface ClienteDao {
    @Insert
    suspend fun inserirCliente(cliente: Cliente)

    @Query("SELECT * FROM Cliente")
    suspend fun listarClientes(): List<Cliente>
}