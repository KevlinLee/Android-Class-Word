package com.example.r2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.r2.ui.theme.R2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            R2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ColorBoxes()
                }
            }
        }
    }
}

@Composable
fun ColorBoxes() {
    Row(modifier = Modifier.fillMaxSize()) {
        ColorBox(
            color = Color.Red,
            text = "红色"
        )
        ColorBox(
            color = Color.Green,
            text = "绿色"
        )
        ColorBox(
            color = Color.Blue,
            text = "蓝色"
        )
    }
}

@Composable
fun ColorBox(color: Color, text: String) {
    Box(
        modifier = Modifier
            .width(133.dp)
            .fillMaxHeight()
            .background(color),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            fontSize = 24.sp,
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    R2Theme {
        ColorBoxes()
    }
}