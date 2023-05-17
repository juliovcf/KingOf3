package com.bambino.kingof3.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Rule (
    @PrimaryKey(autoGenerate = true) val id: Int,
    var description:  String,
    var isActivated: Boolean = false
)