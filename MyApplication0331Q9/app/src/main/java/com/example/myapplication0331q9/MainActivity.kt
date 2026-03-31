package com.example.myapplication0331q9

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigateButton {
                startActivity(Intent(this, SecondaryActivity::class.java))
            }
        }
    }
}

@Composable
fun NavigateButton(onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text("Go to Second Activity")
    }
}

class SecondaryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("Welcome to Second Activity")
        }
    }
}
