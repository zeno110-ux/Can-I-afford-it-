package com.example.caniaffordit.ui.screens
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.caniaffordit.viewmodel.AffordabilityViewModel

@Composable
fun HomeScreen(vm: AffordabilityViewModel, onNav: () -> Unit) {
    Column(modifier = Modifier.padding(20.dp)) {
        Text("Can I Afford It?", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(value = vm.monthlyIncome, onValueChange = { vm.monthlyIncome = it }, label = { Text("Income ($)") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal), modifier = Modifier.fillMaxWidth())
        OutlinedTextField(value = vm.currentExpenses, onValueChange = { vm.currentExpenses = it }, label = { Text("Expenses ($)") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal), modifier = Modifier.fillMaxWidth())
        OutlinedTextField(value = vm.itemPrice, onValueChange = { vm.itemPrice = it }, label = { Text("Price ($)") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal), modifier = Modifier.fillMaxWidth())
        Button(onClick = { vm.calculateAffordability(); onNav() }, modifier = Modifier.fillMaxWidth().padding(top = 20.dp)) { Text("Check") }
    }
}
