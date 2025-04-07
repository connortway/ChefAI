package com.example.chefai.ui.theme.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.chefai.ui.theme.components.BottomNavBar
import com.example.chefai.ui.theme.nav.Screen

@Composable
fun SearchScreen(onNavigate: (Screen) -> Unit) {
    Scaffold(
        bottomBar = { BottomNavBar(onNavigate) }
    ) { paddingValues ->

        Box(modifier = Modifier.fillMaxSize().padding(paddingValues), contentAlignment = Alignment.Center) {
            Text("Search screen coming soon!")
        }
    }
}
