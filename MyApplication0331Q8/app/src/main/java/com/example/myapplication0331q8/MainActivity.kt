package com.example.myapplication0331q8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication0331q8.ui.theme.MyApplication0331Q8Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplication0331Q8Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    InputScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun InputScreen(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("Hello World!") }
    var input by remember { mutableStateOf("") }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = text)
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = input,
            onValueChange = { input = it }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { text = input }) {
            Text("Update")
        }
    }
}
