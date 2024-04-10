package com.example.mynewproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewproject.ui.theme.MyNewProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier
                    .background(color = Color.Yellow)
                    .fillMaxWidth(), color = MaterialTheme.colorScheme.background) {
                    Column {
                        Modifier
                            .background(Color.Yellow)
                            .padding(18.dp)
                            .wrapContentHeight(align = Alignment.Top)
                            .background(color = Color.Blue)
                            .fillMaxWidth()
//                        HelloClient("Erick")
//                        TextComponent(value = "Good", Color.Red, FontFamily.Monospace)
//                        IntroOne()
//                        IntroTwo("Erick")
//                        TextFieldComponent(mylabel = "Hello there welcome")
//                        TextComponent(value = "You have logged in our system yet", Color.Black, FontFamily.Serif )
//                        TextComponent(value = "Welcome back Kimani", Color.Yellow, FontFamily.Monospace)
                        TextComponent(
                            value = "We are family",
                            colorValue = Color.Red,
                            fontFamilyValue = FontFamily.Monospace
                        )
                        ImageComponent()
//                            Spacer(modifier = Modifier.height(20.dp))
//                            TextFieldComponent(mylabel = "Enter your Name")
//                            Spacer(modifier = Modifier.height(20.dp))
//                            TextFieldComponent(mylabel = "Enter your email")
//                            Spacer(modifier = Modifier.height(20.dp))
//                            TextFieldComponent(mylabel = "Enter your age")
//                            Spacer(modifier = Modifier.height(20.dp))
//                            TextFieldComponent(mylabel = "Enter your Gender")
//                            Spacer(modifier = Modifier.height(20.dp))
//                            CheckboxComponent(value = "Hello i Agree to the terms and conditions")
//                            Spacer(modifier = Modifier.height(50.dp))
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(Color.Cyan),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(text = "Travel")
                            }
                            Button(
                                onClick = {
                                          val intent = Intent(this@MainActivity, TravelLogMainActivity2::class.java)
                                    startActivity(intent)
                                },
                                colors = ButtonDefaults.buttonColors(Color.Cyan),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(text = "Login Here")
                            }
                            Button(
                                onClick = {
                                    val intent =
                                        Intent(this@MainActivity, CardActivity2::class.java)
                                    startActivity(intent)
                                },
                                colors = ButtonDefaults.buttonColors(Color.Red),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    modifier = Modifier.padding(15.dp),
                                    text = "LogIn Here"
                                )
                            }
                        Button(
                            onClick = {
                                val intent =
                                    Intent(this@MainActivity, ScrollActivity2::class.java)
                                startActivity(intent)
                            },
                            colors = ButtonDefaults.buttonColors(Color.Red),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                modifier = Modifier.padding(15.dp),
                                text = "LogIn Here"
                            )
                        }
                        Button(
                            onClick = {
                                val intent =
                                    Intent(this@MainActivity, WhatsAppActivity2::class.java)
                                startActivity(intent)
                            },
                            colors = ButtonDefaults.buttonColors(Color.Red),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                modifier = Modifier.padding(15.dp),
                                text = "WhatsApp"
                            )
                        }
                        Button(
                            onClick = {
                                val intent =
                                    Intent(this@MainActivity, IndicatorsActivity2::class.java)
                                startActivity(intent)
                            },
                            colors = ButtonDefaults.buttonColors(Color.Red),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                modifier = Modifier.padding(15.dp),
                                text = "LogIn Here"
                            )
                        }
                        Button(
                            onClick = {
                                val intent =
                                    Intent(this@MainActivity, TruyMainActivity2::class.java)
                                startActivity(intent)
                            },
                            colors = ButtonDefaults.buttonColors(Color.Red),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                modifier = Modifier.padding(15.dp),
                                text = "LogIn Here"
                            )
                        }
                        Button(
                            onClick = {
                                val intent =
                                    Intent(this@MainActivity, TravelMainActivity2::class.java)
                                startActivity(intent)
                            },
                            colors = ButtonDefaults.buttonColors(Color.Red),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                modifier = Modifier.padding(15.dp),
                                text = "LogIn Here"
                            )
                        }
                    }
                }
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HelloClientPreview(){
    Column {
        Modifier
            .background(Color.Green)
            .padding(18.dp)
            .wrapContentHeight(align = Alignment.Top)
            .background(color = Color.Blue)
            .fillMaxWidth()
            TextComponent(value = "Hey there", Color.Red, FontFamily.Cursive)
            TextComponent(value = "Please Register", Color.Cyan, FontFamily.Monospace)
//
//            Spacer(modifier = Modifier.height(40.dp))
//            TextFieldComponent(mylabel = "Enter your Name")
//            Spacer(modifier = Modifier.height(40.dp))
//            TextFieldComponent(mylabel = "Enter your Email")
//            Spacer(modifier = Modifier.height(40.dp))
//            TextFieldComponent(mylabel = "Enter your age")
//            Spacer(modifier = Modifier.height(50.dp))
//            CheckboxComponent(value = "Hello i Agree to the terms and conditions")
//            Spacer(modifier = Modifier.height(50.dp))
//
        ImageComponent()
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier.fillMaxWidth()) {
            Text(modifier = Modifier.padding(15.dp),
                text = "Register Here")
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.fillMaxWidth()) {
            Text(modifier = Modifier.padding(15.dp),
                text = "LogIn Here")

        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {
        },
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.fillMaxWidth()) {
            Text(modifier = Modifier.padding(15.dp),
                text = "LogIn Here")

        }
    }
}
@Composable
fun TextComponent(value: String,
                  colorValue:Color,
                  fontFamilyValue:FontFamily,

                ) {
    Text( modifier = Modifier
        .background(Color.Yellow)

        .padding(18.dp)
        .wrapContentHeight(align = Alignment.Top)
        .background(color = Color.Blue)

        .fillMaxWidth(),
//        fontSize = 10.dp,
        text = value,
        color = colorValue,
        fontFamily = fontFamilyValue
    )
}
@Composable
fun TextFieldComponent(mylabel: String){
    var text by remember {
        mutableStateOf(value = "")
    }
    TextField(modifier = Modifier.fillMaxWidth(),
        value = text, onValueChange = {
        nextText -> text = nextText
    },
        label = { TextFieldLabel(value = mylabel)})
}
@Composable
fun TextFieldLabel(value: String){
    Text(text = value)
}
@Composable
fun CheckboxComponent(value: String){
    Row( modifier = Modifier
        .fillMaxWidth()
        .height(10.dp)
        .padding(16.dp),
         verticalAlignment =  Alignment.CenterVertically
    ){
        val checkedState = remember {
            mutableStateOf(value = false)
        }
        Checkbox(checked = checkedState.value, onCheckedChange = {

        })
        TextField(value = value, onValueChange ={

        })}
@Composable
fun ImageComponent(){
    Image(modifier = Modifier
        .wrapContentHeight()
        .fillMaxWidth()
        .height(60.dp),
        painter = painterResource(id = R.drawable.logo), contentDescription ="Logo Image" )
}
@Composable
fun ImagesInput(){
    Image(painter = painterResource(id = R.drawable.emobilis), contentDescription = "Images")
}}


