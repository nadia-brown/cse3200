package com.example.lab2_part1.model

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
