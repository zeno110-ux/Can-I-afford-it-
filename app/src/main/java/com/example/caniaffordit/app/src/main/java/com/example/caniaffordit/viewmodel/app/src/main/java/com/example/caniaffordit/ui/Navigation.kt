package com.example.caniaffordit.ui
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.*
import com.example.caniaffordit.ui.screens.*
import com.example.caniaffordit.viewmodel.AffordabilityViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val vm: AffordabilityViewModel = viewModel()
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(vm) { navController.navigate("result") } }
        composable("result") { ResultScreen(vm) { navController.popBackStack() } }
    }
}
