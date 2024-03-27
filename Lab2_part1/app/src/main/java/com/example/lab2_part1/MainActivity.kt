package com.example.lab2_part1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab2_part1.controller.NextQuestion
import com.example.lab2_part1.controller.Score
import com.example.lab2_part1.model.AllQuestions
import com.example.lab2_part1.model.UserIdentification
import com.example.lab2_part1.ui.theme.Lab2_part1Theme


class MainActivity : ComponentActivity() {
    val name = UserIdentification()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        name.setName("Nadia Brown")
        setContent {
            Lab2_part1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column (

                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Text("Welcome to my quiz app")
                        QuizComponent(name.getName().toString())
                    }
                }
            }
        }
    }
}
@Composable
fun QuizComponent(name: String, modifier: Modifier = Modifier){
    modifier.fillMaxSize()
    val allQuestions = AllQuestions()
    val nextQuestion = NextQuestion()
    val score = Score(name)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )  {
        var questionNumber by remember { mutableStateOf(0)}
        var question by remember {
            mutableStateOf(allQuestions.getQuestion(0).questionText)
        }
        var userScore by remember {
            mutableStateOf(score.getScore())
        }
        Text(question)
        Row(){
            Button(onClick = { question = "True" }) {
                Text("True Button")
            }
            Button(onClick = { question = "False" }) {
                Text("False Button")
            }
            Button(onClick = {
                questionNumber = nextQuestion.getNextIncQuestionNumber()
                question = allQuestions.getQuestion(questionNumber).questionText
            }) {
                Text("Next Question")
            }
            Button(onClick = { score.getScore()}) {
                Text("User Score is $score")
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab2_part1Theme {
        Greeting("Android")
    }
}