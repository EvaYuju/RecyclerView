package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.SuperHero

    // El adaptador va a recibir
// para que reciba la lista(val...)
// Entre llaves <nombre de nuestro viewHolder>
// Le decimos :para extender=esto va dentro de este código
class SuperHeroAdapter  (private val superHeroList: List<SuperHero>) : RecyclerView.Adapter<SuperHeroViewHolder>() {
    // Devolverle al view holder , que es el encargado de coger los atributos y pintarlos
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
    // le vamos a pasar el item
        val layoutInflater = LayoutInflater.from(parent.context)
        // devuelve por parametros (accedemos al R.layout. )le pasamos el parent, false
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superHeroList[position]
        holder.render(item)
    }
    // Método devuelve el tamaño de la lista
    override fun getItemCount(): Int =
        superHeroList.size


}