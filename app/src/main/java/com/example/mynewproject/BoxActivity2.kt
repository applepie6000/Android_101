package com.example.mynewproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewproject.ui.theme.MyNewProjectTheme


class BoxActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                HomeScreen()


                }
            }
        }
    }
}
@Composable
fun HomeScreen(){
    Box (modifier = Modifier
        .background(Color.Blue)
        .fillMaxSize()
        .wrapContentWidth(Alignment.CenterHorizontally)
        .wrapContentHeight(Alignment.Bottom)) {

        Box (modifier = Modifier
            .background(Color.Cyan)
            .width(150.dp)
            .height(15000.dp)
            .wrapContentHeight(Alignment.Bottom)) {
            Box (modifier = Modifier.background(Color.Red)) {
                Text(text = "Please read the terms and conditions")
            }
    }
    }
}
@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}