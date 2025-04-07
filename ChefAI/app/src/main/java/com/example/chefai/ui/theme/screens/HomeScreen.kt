package com.example.chefai.ui.theme.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
//import androidx.compose.material.*
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
import com.example.chefai.ui.theme.components.BottomNavBar
import com.example.chefai.ui.theme.nav.Screen

@Composable
fun HomeScreen(
    onSubmit: () -> Unit,
    onNavigate: (Screen) -> Unit
) {
    var idea by remember { mutableStateOf("") }
    var ingredients by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }

    Scaffold(
        bottomBar = { BottomNavBar(onNavigate) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("Recipe Idea")
            TextField(
                value = idea,
                onValueChange = { idea = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFD7E8D1), shape = MaterialTheme.shapes.medium)
            )
            Text("Ingredients Available")
            TextField(
                value = ingredients,
                onValueChange = { ingredients = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(Color(0xFFD7E8D1), shape = MaterialTheme.shapes.medium)
            )
            Text("Recipe Name")
            TextField(
                value = name,
                onValueChange = { name = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFD7E8D1), shape = MaterialTheme.shapes.medium)
            )
            Button(
                onClick = onSubmit,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text("Generate Recipe")
            }
        }
    }
}
