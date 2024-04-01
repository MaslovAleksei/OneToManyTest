package com.margarin.onetomanytest.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ViewPointTable")
data class ViewPoint(
    @PrimaryKey
    val viewPointName : String,
    val wellName : String,
    val lon: Int
)
