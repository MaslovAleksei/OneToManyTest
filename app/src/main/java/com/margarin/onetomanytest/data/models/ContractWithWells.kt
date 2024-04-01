package com.margarin.onetomanytest.data.models

import androidx.room.Embedded
import androidx.room.Relation

data class ContractWithWells(
    @Embedded val contract: Contract,
    @Relation(
        entity = Well::class,
        parentColumn = "contractName",
        entityColumn = "contractName",
    )
    val wells: List<WellWithViewPoints>
)
