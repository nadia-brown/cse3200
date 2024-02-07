package com.example.lab01.model

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)