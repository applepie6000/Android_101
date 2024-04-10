package com.example.mynewproject

import android.os.Bundle
import android.os.ParcelFileDescriptor
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewproject.ui.theme.MyNewProjectTheme

class CardActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp)
                        ) {
                            ImageCard(
                                painter = painterResource(id = R.drawable.house3),
                                contentDescription = "These is the title of the image",
                                title = "Hello"
                            )
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp)
                        ) {
                            ImageCard(
                                painter = painterResource(id = R.drawable.house3),
                                contentDescription = "There",
                                title = "Image"
                            )
                        }

                    }



                }
            }
        }
    }
}

@Composable
fun ImageCard(painter: Painter,
              contentDescription: String,
              title: String,
              modifier: Modifier=Modifier){
    Card(modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(10.dp)) {
        Box (modifier = Modifier.height(200.dp)){
            Image(painter =painter, contentDescription = contentDescription  , contentScale = ContentScale.Crop)
            Box (modifier = Modifier
                .matchParentSize()
                .padding(10.dp),
            contentAlignment = Alignment.BottomStart){
                Text(text = title)
            }
        }
    }
}
