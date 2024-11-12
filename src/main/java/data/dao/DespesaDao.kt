package com.example.controledeentregas.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.controledeentregas.data.models.Despesa

@Dao
interface DespesaDao {
    @Insert
    suspend fun inserirDespesa(despesa: Despesa)

    @Query("SELECT * FROM Despesa WHERE viagemId = :viagemId")
    suspend fun listarDespesasPorViagem(viagemId: Int): List<Despesa>
}
