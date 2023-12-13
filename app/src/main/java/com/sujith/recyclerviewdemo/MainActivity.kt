package com.sujith.recyclerviewdemo

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {
    private val fruits = listOf(
        Fruit("Apple"),
        Fruit("Banana"),
        Fruit("Grape"),
        Fruit("Orange"),
        Fruit("Guava"),
        Fruit("Papaya")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setBackgroundColor(Color.YELLOW)
        recyclerView.adapter = MyAdapter(fruits) { selectedFruit: Fruit ->
            itemClicked(selectedFruit)
        }
    }

    private fun itemClicked(fruit: Fruit) {
        Toast.makeText(this, fruit.name, Toast.LENGTH_SHORT).show()
    }
}