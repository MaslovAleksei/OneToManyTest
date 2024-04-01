package com.margarin.onetomanytest.data.models

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Junction
import androidx.room.Relation


data class WellWithViewPoints(
    @Embedded val well: Well,
    @Relation(
        parentColumn = "wellName",
        entityColumn = "wellName",
    )
    val viewPoint: List<ViewPoint>
)

