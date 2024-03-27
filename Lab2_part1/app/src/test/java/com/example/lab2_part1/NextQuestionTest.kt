package com.example.lab2_part1

import com.example.lab2_part1.controller.NextQuestion
import com.example.lab2_part1.model.AllQuestions
import org.junit.Assert
import org.junit.Test

class NextQuestionTest {

    @Test
    fun getNextLinearQuestionTest1(){
        val allQuestions = AllQuestions()
        var totalNumberOfQuestions = allQuestions.getNumberOfQuestions()
        val currentQuestion = 0
        val nextQuestion = NextQuestion()

        repeat(totalNumberOfQuestions-1, {nextQuestion.getNextLinearQuestion()})

        Assert.assertEquals(nextQuestion.getNextLinearQuestion(), 0)
    }

    fun getNextRandomQuestionTest2(){
        val allQuestions = AllQuestions()
        val currentQuestion = 0
        val nextQuestion = NextQuestion()


    }


}