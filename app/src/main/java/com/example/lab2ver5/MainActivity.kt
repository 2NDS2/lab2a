package com.example.lab2ver5

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab2ver5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), DogClickListener
{
    private lateinit var binding: ActivityMainBinding

    var cover = arrayOf(R.drawable.samoed, R.drawable.bgil, R.drawable.chau_chau, R.drawable.chikhuakhua, R.drawable.doberman,
        R.drawable.mops, R.drawable.pekines, R.drawable.pomeranskij_shpic, R.drawable.rotveiler, R.drawable.siba_inu)


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateDog()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = CardAdapter(dogList, mainActivity)
        }
    }
    override fun onClick(dog: Dog)
    {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(DOG_ID_EXTRA, dog.id)
        startActivity(intent)
    }


    private fun populateDog() {
        val dogNames: Array<String> = resources.getStringArray(R.array.dogNames)
        val dogInfo: Array<String> = resources.getStringArray(R.array.dogInfo)
        for (i in dogNames.indices) {
            val dog1 = Dog(cover[i], dogNames[i], dogInfo[i])
            dogList.add(dog1)
        }
    }
}