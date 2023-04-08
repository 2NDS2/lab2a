package com.example.lab2ver5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab2ver5.databinding.CardCellBinding

class CardAdapter (private val dogs: List<Dog>,
private val clickListener: DogClickListener): RecyclerView.Adapter<CardViewHolder> ()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)

    }
    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindDog(dogs[position])
    }
    override fun getItemCount(): Int = dogs.size
}