package com.margarin.onetomanytest.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.margarin.onetomanytest.data.models.Contract
import com.margarin.onetomanytest.data.models.ViewPoint
import com.margarin.onetomanytest.data.models.Well

@Database(entities = [
    Contract::class,
    Well::class,
    ViewPoint::class,
                     ], version = 1, exportSchema = false)
abstract class TestDatabase: RoomDatabase() {

    abstract fun getWellDao(): WellDao
    abstract fun getContractDao(): ContractDao
    abstract fun getViewPointsDao(): ViewPointDao

}