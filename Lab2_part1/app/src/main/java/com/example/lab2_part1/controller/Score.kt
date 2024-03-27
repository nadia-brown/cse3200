package com.example.lab2_part1.controller

data class Score(val name: String){
    companion object{
        private var score = 0
    }

    fun incrementScore(){
        score++
    }

    fun getScore(): Int {
        return score
    }
}
