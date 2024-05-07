package com.example.middleexam

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun EndPage(navController: NavHostController) {
    Column {
        Text(text = "结束页面")
        Button(onClick = {
            navController.navigate("Home")
        }) {
            Text(text = "考试结束")
        }
    }
}