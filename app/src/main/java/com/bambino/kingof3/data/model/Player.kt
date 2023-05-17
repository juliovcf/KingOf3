package com.bambino.kingof3.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Player(
    @PrimaryKey(autoGenerate = true) val id: Int,
    var name: String,
    var isLordOfThree: Boolean = false,
    var timesLordOfThree: Int = 0,
    var timesDrank: Int = 0
)
