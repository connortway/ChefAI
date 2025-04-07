package com.example.chefai.ui.theme.nav



import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chefai.model.sampleRecipe
import com.example.chefai.ui.theme.screens.HomeScreen
import com.example.chefai.ui.theme.screens.RecipeCardScreen
import com.example.chefai.ui.theme.screens.SearchScreen

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Recipe : Screen("recipe")
    object Search : Screen("search")
}

@Composable
fun RecipeApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(
                onSubmit = { navController.navigate(Screen.Recipe.route) },
                onNavigate = { navController.navigate(it.route) }
            )
        }
        composable(Screen.Recipe.route) {
            RecipeCardScreen(
                recipe = sampleRecipe(),
                onNavigate = { navController.navigate(it.route) }
            )
        }
        composable(Screen.Search.route) {
            SearchScreen(onNavigate = { navController.navigate(it.route) })
        }
    }
}
