package com.example.a146562.ui.theme

class Recipe (
    val title: String,
    val type: String,
    val servings: Int,
    val difficulty: String,
    val ingredients: List<String>,
    val steps: List<String>
)

object RecipeDataProvider {
    val recipes = listOf(
        Recipe("Chapati", "Breakfast", 8, "Intermediate", listOf("Flour", "Water", "Cooking oil"), listOf("Knead dough", "fry")),
        Recipe("Rice Beans", "Lunch", 4, "Intermediate", listOf("Rice", "Beans",), listOf("Boil rice", "Cook ingredients and beans together")),
        Recipe("Ugali Beef stew", "Supper", 4, "Intermediate", listOf("Flour", "Meat", "Water"), listOf("Boil water add flour and stir", "Cook ingredients and meat together")),

        )
}