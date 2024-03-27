package com.example.lab2_part1.model

class AllQuestions {
    public val allQuestions = arrayListOf<Question<Boolean>>(
        Question<Boolean>("Jupiter is the largest planet in our solar system", true, Difficulty.MEDIUM),
        Question<Boolean>("Saturn is the largest planet in our solar system",false,Difficulty.MEDIUM),

    )

    fun getNumberOfQuestions() : Int {
        return allQuestions.size
    }

    fun getQuestion(i: Int) : Question<Boolean>{
        return allQuestions[i]
    }

}