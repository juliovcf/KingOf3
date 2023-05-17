package com.bambino.kingof3.data.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.bambino.kingof3.data.model.Rule

@Dao
interface RuleDao {
    @Query("SELECT * FROM rule WHERE isActivated = 1")
    fun getActiveRules(): LiveData<List<Rule>>

    @Query("SELECT * FROM rule WHERE isActivated = 0")
    fun getInactiveRules(): LiveData<List<Rule>>

    @Insert
    suspend fun insert(rule: Rule)

    @Delete
    suspend fun delete(rule: Rule)

    @Update
    suspend fun update(rule: Rule)
}
