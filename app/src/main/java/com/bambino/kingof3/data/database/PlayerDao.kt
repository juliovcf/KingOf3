package com.bambino.kingof3.data.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.bambino.kingof3.data.model.Player

@Dao
interface PlayerDao {
    @Query("SELECT * FROM player")
    fun getAllPlayers(): LiveData<List<Player>>

    @Insert
    suspend fun insert(player: Player)

    @Delete
    suspend fun delete(player: Player)

    @Update
    suspend fun update(player: Player)
}
