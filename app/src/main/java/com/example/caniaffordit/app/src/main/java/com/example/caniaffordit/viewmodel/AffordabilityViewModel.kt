package com.example.caniaffordit.viewmodel
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class AffordabilityViewModel : ViewModel() {
    var monthlyIncome by mutableStateOf("")
    var currentExpenses by mutableStateOf("")
    var itemPrice by mutableStateOf("")
    var affordabilityResult by mutableStateOf<Boolean?>(null)
    var suggestion by mutableStateOf("")

    fun calculateAffordability() {
        val income = monthlyIncome.toDoubleOrNull() ?: 0.0
        val expenses = currentExpenses.toDoubleOrNull() ?: 0.0
        val price = itemPrice.toDoubleOrNull() ?: 0.0
        val remaining = income - expenses
        
        if (remaining >= price && remaining > 0) {
            affordabilityResult = true
            suggestion = "Yes! You have $${"%.2f".format(remaining - price)} left."
        } else {
            affordabilityResult = false
            suggestion = "No. You are short by $${"%.2f".format(price - remaining)}."
        }
    }
}
