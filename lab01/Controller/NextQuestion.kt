package com.example.lab01.Controller

import com.example.lab01.model.AllQuestions


class NextQuestion {
    val myQuestions = AllQuestions()
    val totalQuestions = myQuestions.totalQuestions()
}