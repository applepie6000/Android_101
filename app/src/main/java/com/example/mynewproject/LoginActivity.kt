package com.example.mynewproject

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewproject.ui.theme.MyNewProjectTheme
import com.example.mynewproject.MainActivity
import com.example.mynewproject.TextComponent
import com.example.mynewproject.TextFieldComponent

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    Column {
                        Modifier
                            .background(Color.Green)
                            .padding(18.dp)
                            .wrapContentHeight(align = Alignment.Top)
                            .background(
                                color = Color.Yellow

                            )


                        TextComponent(
                            value = "Hello there",
                            colorValue = Color.Blue,
                            fontFamilyValue = FontFamily.Monospace
                        )
                        TextComponent(value = "Hey there", Color.Blue, FontFamily.Cursive)
                        TextComponent(value = "Welcome Back", Color.Blue, FontFamily.Monospace)


                        ImageComponent()
                        Spacer(modifier = Modifier.height(40.dp))
                        TextFieldComponent(mylabel = "Enter your Name")
                        Spacer(modifier = Modifier.height(40.dp))
                        TextFieldComponent(mylabel = "Enter your Email")
                        Spacer(modifier = Modifier.height(40.dp))
                        TextFieldComponent(mylabel = "Enter your age")
                        Spacer(modifier = Modifier.height(40.dp))
                        Button(onClick = {
                                         val intent = Intent(this@LoginActivity,MainActivity::class.java)
                            startActivity(intent)
                        },
                            modifier = Modifier.fillMaxWidth()) {
                            Text(text = "Login Here")
                        }


                    }

                }
            }
        }
    }
}
@Preview
@Composable
fun LogInPreview(){
    Column {
        Modifier
            .background(Color.Green)
            .padding(18.dp)
            .wrapContentHeight(align = Alignment.Top)
            .background(color = Color.White)
            .fillMaxWidth()

        TextComponent(value = "Hey there", Color.Red, FontFamily.Monospace)
        TextComponent(value = "Welcome Back", Color.Cyan, FontFamily.Monospace)
        ImageComponent()
        Spacer(modifier = Modifier.height(40.dp))
        TextFieldComponent(mylabel = "Enter your Email")
        Spacer(modifier = Modifier.height(40.dp))
        TextFieldComponent(mylabel = "Enter your Password")
        Spacer(modifier = Modifier.height(50.dp))
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "Login Here")
        }




    }
}
@Composable
fun ImageComponent(){
    Image(modifier = Modifier
        .wrapContentHeight()
        .fillMaxWidth()
        .height(60.dp),
        painter = painterResource(id = R.drawable.logo), contentDescription ="Logo Image" )
}
