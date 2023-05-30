package com.bambino.kingof3.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bambino.kingof3.data.database.PlayerRepository
import com.bambino.kingof3.data.database.RuleRepository
import com.bambino.kingof3.data.model.Player
import com.bambino.kingof3.data.model.Rule
import kotlinx.coroutines.launch

class MainViewModel(private val playerRepository: PlayerRepository, private val ruleRepository: RuleRepository) : ViewModel() {
    val players: LiveData<List<Player>> = playerRepository.players
    val activeRules: LiveData<List<Rule>> = ruleRepository.activeRules
    val inactiveRules: LiveData<List<Rule>> = ruleRepository.inactiveRules

    fun addRule(description: String, isActivated: Boolean) {
        viewModelScope.launch {
            ruleRepository.insertRule(Rule(0, description, isActivated))
        }
    }

    fun toggleRuleActivation(rule: Rule) {
        viewModelScope.launch {
            rule.isActivated = !rule.isActivated
            ruleRepository.updateRule(rule)
        }
    }

    // Agrega métodos para manejar los lanzamientos de dados y determinar quién bebe, según las reglas de tu juego
}
