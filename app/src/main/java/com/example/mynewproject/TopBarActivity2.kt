package com.example.mynewproject

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.example.mynewproject.ui.theme.MyNewProjectTheme
import kotlin.math.sign

class TopBarActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                TopBar()
                }
            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(){
    val context = LocalContext.current.applicationContext
    TopAppBar(title = { Text( text = "App")},
        navigationIcon = {
            IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Filled.Home, contentDescription ="Home" )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.DarkGray,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.Green
        ),
        actions ={
            IconButton(onClick = {Toast.makeText(context,"You have  clicked on the search button", Toast.LENGTH_SHORT.sign).show()}) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search", tint = Color.White,)
            }
            IconButton(onClick = {Toast.makeText(context, "You have clicked on the Share Button", Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Share, contentDescription = "Share", tint = Color.White)
            }
            IconButton(onClick = {Toast.makeText(context, "You have clicked on the Menu Button", Toast.LENGTH_SHORT).show()  }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu", tint = Color.White)
            }
            }
        )
}



@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TopBarPreview(){
    TopBar()
}


