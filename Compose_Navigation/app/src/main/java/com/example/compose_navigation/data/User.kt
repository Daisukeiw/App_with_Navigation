package com.example.compose_navigation.data

data class User(
    val userId: String,
    val name: String,
    val avatarUrl: String?,
    val age: Int,
    val score: Int,
    val registerDate: String,
    val curso: String,
    val email: String,
    val bio: String
)
