package com.margarin.onetomanytest.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.margarin.onetomanytest.data.models.Well
import kotlinx.coroutines.flow.Flow

@Dao
interface WellDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWell(well: Well)


}