package com.example.lab2ver5

var dogList = mutableListOf<Dog>()
val DOG_ID_EXTRA = "dogExtra"

class Dog(
    var cover: Int,
    var dogName: String,
    var dogInfo: String,
    val id: Int? = dogList.size
)
