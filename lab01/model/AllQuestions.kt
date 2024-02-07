package com.example.lab01.model

class AllQuestions {

    public val allQuestion = arrayOf(
        Question<Boolean>("Jupiter is the largest planet in our solar system", answer = true, Difficulty.MEDIUM),
        Question<Boolean>("Saturn is the largest planet in our solar system", answer = false, Difficulty.MEDIUM),
        Question<Int>("What year was the united states born?", answer = 1776, Difficulty.EASY),
        Question<Int>("What year was UConn founded?", answer = 1881, Difficulty.MEDIUM),
        Question<String>("The highest award in computing is named after Alan T_____", answer = "Turing", Difficulty.EASY),
        Question<String>("What is the capital of Connecticut?", answer = "Hartford,", Difficulty.EASY)
    )

    fun totalQuestions():Int {
        return allQuestion.size
    }
}