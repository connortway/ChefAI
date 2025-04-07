package com.example.chefai.model



data class Recipe(
    val ingredients: List<String>,
    val instructions: List<String>
)

fun sampleRecipe() = Recipe(
    ingredients = listOf(
        "200g spaghetti or any pasta you like",
        "3 tablespoons olive oil",
        "3–4 garlic cloves, thinly sliced",
        "1/4 teaspoon red pepper flakes (optional)",
        "Salt (to taste)",
        "Freshly ground black pepper (to taste)",
        "Fresh parsley, chopped (optional)",
        "Grated Parmesan (optional)"
    ),
    instructions = listOf(
        "Cook the pasta:\n• Bring a large pot of salted water to a boil.\n• Add pasta and cook according to package instructions until al dente. Reserve 1/2 cup of pasta water, then drain.",
        "Prepare the sauce:\n• While the pasta cooks, heat olive oil in a large skillet over medium heat.\n• Add garlic and sauté until golden."
    )
)
