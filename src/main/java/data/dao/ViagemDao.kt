package com.example.controledeentregas.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.controledeentregas.data.models.Viagem

@Dao
interface ViagemDao {
    @Insert
    suspend fun inserirViagem(viagem: Viagem)

    @Update
    suspend fun atualizarViagem(viagem: Viagem)

    @Query("DELETE FROM Viagem WHERE id = :id")
    suspend fun removerViagem(id: Int)

    @Query("SELECT * FROM Viagem")
    suspend fun listarViagens(): List<Viagem>
}
