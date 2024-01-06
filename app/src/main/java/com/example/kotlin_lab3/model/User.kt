package com.example.kotlin_lab3.model

import com.example.kotlin_lab3.R

data class User(
    val id: Int,
    val name: String,
    val avatar: Int,
    val numberOfFolowers: Int,
    val numberOfFolowed: Int,
    val numberOfPosts: Int,
    val userDescription: String,
    val country: String,
    val city: String
) {
    companion object {
        val example = User(
            id = 1,
            name = "Arthur Shelby",
            R.drawable.arthur,
            numberOfFolowers = 8000,
            numberOfFolowed = 500,
            numberOfPosts = 30,
            userDescription = "Older brother and undisputed leader of the Shelby family",
            country = "England",
            city = "Birmingham"
        )

        val example2 = User(
            id = 2,
            name = "Thomas Shelby",
            R.drawable.thomas,
            numberOfFolowers = 20000,
            numberOfFolowed = 200,
            numberOfPosts = 15,
            userDescription = "A leader who strives to create change in the world around him",
            country = "England",
            city = "Birmingham"
        )
    }
}
