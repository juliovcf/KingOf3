package com.bambino.kingof3.data.database

import androidx.lifecycle.LiveData
import com.bambino.kingof3.data.model.Rule

class RuleRepository(private val ruleDao: RuleDao) {

    val activeRules: LiveData<List<Rule>> = ruleDao.getActiveRules()
    val inactiveRules: LiveData<List<Rule>> = ruleDao.getInactiveRules()

    suspend fun insertRule(rule: Rule) {
        ruleDao.insert(rule)
    }

    suspend fun deleteRule(rule: Rule) {
        ruleDao.delete(rule)
    }

    suspend fun updateRule(rule: Rule) {
        ruleDao.update(rule)
    }
}
