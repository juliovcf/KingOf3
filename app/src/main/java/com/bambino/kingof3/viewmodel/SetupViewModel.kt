package com.bambino.kingof3.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bambino.kingof3.data.database.PlayerRepository
import com.bambino.kingof3.data.model.Player
import kotlinx.coroutines.launch

class SetupViewModel(private val playerRepository: PlayerRepository) : ViewModel() {
    val players: LiveData<List<Player>> = playerRepository.players

    fun addPlayer(name: String) {
        viewModelScope.launch {
            playerRepository.insertPlayer(Player(0, name, false, 0, 0))
        }
    }
}
