package com.margarin.onetomanytest.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ContractTable")
data class Contract(
    @PrimaryKey
    val contractName : String,
    val age: Int
)
