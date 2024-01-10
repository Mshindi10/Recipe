package com.example.a146562.ui.theme

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a146562.R


class ExploreActivity : AppCompatActivity() {
    private lateinit var recipeAdapter: RecipeAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        // Assuming RecipeDataProvider.recipes is a list of Recipe objects
        val recipes = RecipeDataProvider.recipes

        // Initialize the RecipeAdapter with a lambda function for item click
        recipeAdapter = RecipeAdapter(recipes) { recipe -> showRecipeDetails(recipe) }

        val recyclerView: RecyclerView = findViewById(/* id = */ R.id.recyclerView)
        recyclerView.adapter = recipeAdapter

        // Set a LinearLayoutManager to your RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun showRecipeDetails(recipe: Any) {
        // TODO: Implement the logic to show recipe details (e.g., navigate to RecipeDetailsActivity)
    }
}
