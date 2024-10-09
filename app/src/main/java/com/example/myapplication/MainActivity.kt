package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.ApplicationTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HappyBirthday(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding),
                        color = Color.Green
                    )
                }
            }
        }
    }
}

@Composable
fun HappyBirthday(name: String, modifier: Modifier = Modifier, color: Color) {
    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Happy birthday $name!",
            modifier = modifier.padding(20.dp),
            color = color,
            fontSize = 30.sp
        )

        Text(
            text = "Happy birthday ss $name!",
            modifier = modifier.padding(20.dp),
            color = color,
            fontSize = 30.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Happy birthday preview")
@Composable
fun HappyBirthdayPreview() {
    ApplicationTheme {
        HappyBirthday(name = "Hamza", color = Color.Green)
    }
}