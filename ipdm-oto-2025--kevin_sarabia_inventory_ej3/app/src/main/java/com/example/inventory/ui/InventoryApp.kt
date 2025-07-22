
package com.example.inventory.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.inventory.ui.navigation.InventoryNavHost

@Composable
fun InventoryApp() {
    val navController = rememberNavController()
    InventoryNavHost(navController = navController)
}
