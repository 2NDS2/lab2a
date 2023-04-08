package com.example.lab2ver5

import androidx.recyclerview.widget.RecyclerView
import com.example.lab2ver5.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: DogClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindDog(dog: Dog)
    {
        cardCellBinding.cover.setImageResource(dog.cover)
        cardCellBinding.dogName.text = dog.dogName

        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(dog)
        }
    }
}