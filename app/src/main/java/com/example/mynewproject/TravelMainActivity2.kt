package com.example.mynewproject

import android.graphics.ColorSpace.Rgb.TransferParameters
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.text.style.ClickableSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.mynewproject.ui.theme.MyNewProjectTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.ConnectivityManagerCompat.RestrictBackgroundStatus
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import java.nio.file.WatchEvent


class TravelMainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Screen()

                }
            }
        }
    }
}

@Composable
fun Screen(){
    Image(painter = painterResource(id = R.drawable.stone3), contentDescription = "Stone", contentScale = ContentScale.FillBounds )
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentWidth(Alignment.CenterHorizontally)) {
        Row (modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            horizontalArrangement = Arrangement.Center){
            Icon(painter = painterResource(id = R.drawable.baseline_airplanemode_active_24), contentDescription = "Icon")
            Text(text = "Travelezy")
        }
        Spacer(modifier = Modifier
            .height(430.dp)
            .padding(5.dp))
        Card(modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .alpha(0.8f), colors = CardDefaults.cardColors(Color.Black)) {
            Box(modifier = Modifier.padding(10.dp)) {
                Column (modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "Explore the world here", fontSize = 15.sp)
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "The best Travel app in the world in 2021", fontSize = 9.sp)
                    Text(text = "Answer of Travel to find their journey", fontSize = 9.sp)
                    Spacer(modifier = Modifier.height(10.dp))
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        modifier = Modifier.width(220.dp)) {
                        Text(text = "Create an Account", fontSize = 10.sp)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "Already have an Account", fontSize = 10.sp)

               }

            }
        }
    }
}







