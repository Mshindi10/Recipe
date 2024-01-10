package com.example.a146562.ui.theme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a146562.R

class RecipeAdapter(private val recipes: List<Recipe>, private val onRecipeClickListener: (Any) -> Unit) :
    RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    interface OnRecipeClickListener {
        fun onRecipeClick(position: Int)
    }

    inner class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onRecipeClickListener.onRecipeClick(position)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}

private fun <P1, R> ((P1) -> R).onRecipeClick(position: P1) {

}
