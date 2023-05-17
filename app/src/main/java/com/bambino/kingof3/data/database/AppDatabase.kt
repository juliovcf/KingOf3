package com.bambino.kingof3.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bambino.kingof3.data.model.Player
import com.bambino.kingof3.data.model.Rule

@Database(entities = [Player::class, Rule::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun playerDao(): PlayerDao
    abstract fun ruleDao(): RuleDao
}
