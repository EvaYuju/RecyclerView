package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.SuperHeroAdapter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // SuperHeroProvider.superHeroList
        initRecyclerView()
    }
    private fun initRecyclerView() {
        // Se le indica el tipo espaciado a utilizar (lista de una columna))
        // binding.recyclerSuperHero.layoutManager = LinearLayoutManager(this)
        // Se le indica qué clase Adapter se encarga de proveer los datos al RecyclerView
        // binding.recyclerSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)

        // enlazaría este código con el componente RecyclerView de la vista principal
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerSuperHero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)
    }
}
