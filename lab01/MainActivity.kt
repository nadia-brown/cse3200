package com.example.lab01

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab01.ui.theme.Lab01Theme
const val ON__CREATE = "ON_CREATE"
const val ON__START = "ON_START"
const val ON__STOP = "ON_STOP"
const val ON__PAUSE = "ON_PAUSE"
const val ON__RESUME = "ON_RESUME"
const val ON__DESTROY = "ON_DESTROY"

class MainActivity : ComponentActivity() {
    override fun onStart() {
        super.onStart()
        Log.i(ON__START, "onStart called")
    }

    override fun onStop() {
        super.onStop()
        Log.i(ON__STOP, "onStop called")
    }

    override fun onPause() {
        super.onPause()
        Log.i(ON__PAUSE, "onPause called")
    }

    override fun onResume() {
        super.onResume()
        Log.i(ON__RESUME, "onResume called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(ON__DESTROY, "onDestroy called")
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
    Lab01Theme {
        Greeting("Android")
    }
}