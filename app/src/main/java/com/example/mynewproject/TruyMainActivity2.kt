package com.example.mynewproject


import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.mynewproject.ui.theme.MyNewProjectTheme

class TruyMainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,

                ) {
                    Wall()
                }
            }
        }
    }
}
@Composable
fun Wall() {
    Image(painter = painterResource(id = R.drawable.images), contentDescription = "Image", contentScale = ContentScale.Crop, alpha = 0.7f)
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(70.dp))
        Text(text = "Wanderly", fontSize = 20.sp)
        Text(text = "Your Unlimited Companion for Seamless", fontSize = 10.sp, fontWeight = FontWeight.Bold)
        Text(text = "Travel Experience", fontSize = 10.sp, fontWeight = FontWeight.Light)
        Spacer(modifier = Modifier.height(300.dp))
        Button(onClick = {  },
            colors = ButtonDefaults.buttonColors(Color.Green),
        ) {
            Text(text = "Sign in with Phone Number", color = Color.White)
        }
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = { /*TODO*/ }, modifier = Modifier.width(310.dp), colors = ButtonDefaults.buttonColors(
            Color.White)) {
            Text(text = "Sign in with Apple ", color = Color.Black)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Don't have an Account?   SignUp", fontSize = 10.sp)
        Spacer(modifier = Modifier.height(18.dp))
        Text(text = "By creating an Account or SignIn you Agree to", fontSize = 9.sp)
        Text(text = "our Terms and Services and Privacy Policy.", fontSize = 9.sp)
    }
}
@Preview
@Composable
fun Preview(){
    Wall()
}