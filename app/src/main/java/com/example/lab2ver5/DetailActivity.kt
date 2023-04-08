package com.example.lab2ver5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab2ver5.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dogID = intent.getIntExtra(DOG_ID_EXTRA, -1)
        val dog = dogFromID(dogID)
        if(dog != null)
        {
            binding.cover.setImageResource(dog.cover)
            binding.dogName.text = dog.dogName
            binding.dogInfo.text = dog.dogInfo
        }
    }

    private fun dogFromID(dogID: Int): Dog?
    {
        for(dog in dogList)
        {
            if(dog.id == dogID)
                return dog
        }
        return null
    }
}