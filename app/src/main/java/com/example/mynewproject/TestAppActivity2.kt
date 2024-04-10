package com.example.mynewproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewproject.ui.theme.MyNewProjectTheme
import java.nio.file.WatchEvent

class TestAppActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {



                }
            }
        }
    }
}
@Composable
fun Paper(){
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Ïmage",
            contentScale = ContentScale.FillBounds,
        )

        Box(
            modifier = Modifier
                .wrapContentWidth(Alignment.CenterHorizontally).wrapContentWidth(Alignment.CenterHorizontally)
                .height(500.dp).background(Color.Blue)

        ) {
            Column {
                Text(text = "Wander")
                Text(text = "Your ultimate Companion for Seamless")
                Text(text = "Travel Experiences")
            }

            Box(
                modifier = Modifier
                    .wrapContentHeight(Alignment.Bottom)
                    .fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally)
            ) {
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Red)
                    .wrapContentWidth(Alignment.CenterHorizontally)
            ) {
                Column(modifier = Modifier.wrapContentWidth(Alignment.CenterHorizontally)) {
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.Green),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "SignIn with Phone Number")
                    }
                    Spacer(modifier = Modifier.padding(10.dp))
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.textButtonColors(Color.Black),
                        modifier = Modifier.fillMaxWidth()


                    ) {
                        Text(text = "SignIn With Apple")
                    }
                    Text(text = "Don't have an Account? SignUp")
                    Text(text = "By creating an Account or signing In You Agree to")
                    Text(text = "our Terms and Services and Privacy Policies")
                }
            }
          }
        }



@Preview
@Composable
fun PaperPreview(){
    Paper()
}