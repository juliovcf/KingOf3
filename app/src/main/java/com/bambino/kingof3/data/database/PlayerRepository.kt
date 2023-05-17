package com.bambino.kingof3.data.database

import androidx.lifecycle.LiveData
import com.bambino.kingof3.data.model.Player

class PlayerRepository(private val playerDao: PlayerDao) {

    val players: LiveData<List<Player>> = playerDao.getAllPlayers()

    suspend fun insertPlayer(player: Player) {
        playerDao.insert(player)
    }

    suspend fun deletePlayer(player: Player) {
        playerDao.delete(player)
    }

    suspend fun updatePlayer(player: Player) {
        playerDao.update(player)
    }
}
