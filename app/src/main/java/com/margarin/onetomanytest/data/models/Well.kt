package com.margarin.onetomanytest.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "WellTable")
data class Well (
    @PrimaryKey
    val wellName : String,
    val contractName: String,
    val depth: Int
)