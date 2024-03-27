package com.example.lab2_part1.controller

import com.example.lab2_part1.model.AllQuestions

class NextQuestion {

    private  val totalQuestions = AllQuestions().getNumberOfQuestions()
    private  var currentQuestion = 0

    fun getNextIncQuestionNumber() : Int {
        currentQuestion = (currentQuestion + 1) % totalQuestions
        return  currentQuestion
    }

    fun getNextRandomQuestionNumber() : Int {
        val getRand = (0.. totalQuestions).random()
        return getRand
    }

}