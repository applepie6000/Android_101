package com.example.mynewproject

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.twotone.Menu
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mynewproject.ui.theme.MyNewProjectTheme
import kotlin.math.sign

class WhatsAppActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                TopBarApps()
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarApps(){
    val context = LocalContext.current.applicationContext
    TopAppBar(title = { Text( text = "WhatsApp")},
        navigationIcon = {

        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.DarkGray,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.Green
        ),
        actions ={
            IconButton(onClick = {Toast.makeText(context,"You have  clicked on the search button", Toast.LENGTH_SHORT.sign).show()}) {
                Icon(painter = painterResource(id = R.drawable.outline_photo_camera_24), contentDescription = "Camera"  , tint = Color.White,)
            }
            IconButton(onClick = {Toast.makeText(context, "You have clicked on the Share Button", Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search", tint = Color.White)
            }
            IconButton(onClick = {Toast.makeText(context, "You have clicked on the Menu Button", Toast.LENGTH_SHORT).show()  }) {
                Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "More", tint = Color.White)
            }
        }
    )
}


