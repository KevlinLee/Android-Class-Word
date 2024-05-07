package com.example.middleexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.middleexam.ui.theme.MiddleExamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiddleExamTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
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
    MiddleExamTheme {
        Greeting("Android")
    }
}
@Composable
fun Navigator(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){

        composable("Home"){ HomePage(navController)}
        composable("Commodity"){ CommodityPage(navController)}
        composable("Equipment"){ EquipmentPage(navController)}
        composable("End"){ EndPage(navController)}
    }
}

@Composable
fun HomePage(navController: NavController){
    Column {
        Button(onClick = {navController.navigate("Commodity")})
        {
            Text(text = "Commodity")
        }
        Button(onClick = {navController.navigate("Equipment")})
        {
            Text(text = "Equipment")
        }
        Button(onClick = {navController.navigate("End")})
        {
            Text(text = "End")
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun previeHost(){
    Navigator()
}