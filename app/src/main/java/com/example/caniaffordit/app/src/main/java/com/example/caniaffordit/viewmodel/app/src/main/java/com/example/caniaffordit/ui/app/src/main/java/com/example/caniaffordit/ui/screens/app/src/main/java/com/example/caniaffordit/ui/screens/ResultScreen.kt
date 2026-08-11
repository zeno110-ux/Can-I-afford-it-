package com.example.caniaffordit.ui.screens
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.caniaffordit.viewmodel.AffordabilityViewModel

@Composable
fun ResultScreen(vm: AffordabilityViewModel, onBack: () -> Unit) {
    Column(Modifier.fillMaxSize().padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(if (vm.affordabilityResult == true) "YES" else "NO", style = MaterialTheme.typography.displayLarge)
        Text(vm.suggestion)
        Button(onClick = onBack, Modifier.padding(top = 30.dp)) { Text("Back") }
    }
}
