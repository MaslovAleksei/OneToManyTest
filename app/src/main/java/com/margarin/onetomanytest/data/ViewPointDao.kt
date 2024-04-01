package com.margarin.onetomanytest.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.margarin.onetomanytest.data.models.ViewPoint
import kotlinx.coroutines.flow.Flow

@Dao
interface ViewPointDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertViewPoint(viewPoint: ViewPoint)


}