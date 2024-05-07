package com.example.middleexam

import android.app.Person
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


data class Commodity(
    val price: Int,
    val provenance: String,
    val name: String,
    val kind: String,
    val brand: String

)
data class Equipment(
    val phone: String,
    val laptop: String,
    val radio: String,
    val television: String,
    val monitor: String
)

val CommodityList = listOf(
    Commodity(25, "England","Cookie","food","ferd"),
    Commodity(25, "China","wrench","tool","Triger"
    ),
    Commodity(25,"Tailand","elastomer","material","hevan")
)


val EquipmentList = listOf(
    Equipment("redmiK60", "legion","MarShell","Hisense","LCD"),
    Equipment("iphone5", "leveno","MarShell","SHARP","LED",),
    Equipment("iphone14proMax", "macbook","MarShell","","OLED"),
    Equipment("HUAWEI", "SAMSUNG","Marshell","SAMSUNG","LED")

)



