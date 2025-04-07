package com.example.chefai.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.chefai.model.Recipe
import com.example.chefai.ui.theme.components.BottomNavBar
import com.example.chefai.ui.theme.nav.Screen

@Composable
fun RecipeCardScreen(recipe: Recipe, onNavigate: (Screen) -> Unit) {
    Scaffold(
        bottomBar = { BottomNavBar(onNavigate) }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Text("Ingredients", style = MaterialTheme.typography.bodyMedium)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFD7E8D1), shape = MaterialTheme.shapes.medium)
                        .padding(12.dp)
                ) {
                    Column {
                        recipe.ingredients.forEach {
                            Text("• $it")
                        }
                    }
                }
            }

            item {
                Text("Instructions", style = MaterialTheme.typography.bodyMedium)
            }

            itemsIndexed(recipe.instructions) { index, instruction ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFD7E8D1), shape = MaterialTheme.shapes.medium)
                        .padding(12.dp)
                ) {
                    Text("${'a' + index}. $instruction")
                }
            }
        }
    }
}
