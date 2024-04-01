package com.margarin.onetomanytest.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.margarin.onetomanytest.data.models.Contract
import com.margarin.onetomanytest.data.models.ContractWithWells
import kotlinx.coroutines.flow.Flow

@Dao
interface ContractDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertContract(contract: Contract)

    @Transaction
    @Query("SELECT * FROM ContractTable")
    fun getAllContracts(): Flow<List<ContractWithWells>>



}