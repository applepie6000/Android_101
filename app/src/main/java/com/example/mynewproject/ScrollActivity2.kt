package com.example.mynewproject
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mynewproject.ui.theme.MyNewProjectTheme

class ScrollActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val employees = listOf( "John", "Erick", "Kenny", "James", "Kamau", "Max", "Njeri", "Gerry", "Andrew", "Moses", "Judy", "Kelvin", "Marry", "Jane", "Anne")
                    val students = listOf("James", "Jacob", "MarryJane", "Simon", "Peter", "Armstrong", "Trump", "Ruto", "CanonBanana", "Biden")

                ListScreen(modifier = Modifier,employees, students)
                    
                }
            }
        }
    }
}

@Composable
fun ListScreen(modifier: Modifier= Modifier, employees: List<String>, students: List<String>){
    Box (modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.emobilis),
            contentDescription = "backgroundImage", contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())

    }
    Column(modifier = Modifier.fillMaxSize() ){
        LazyRow (contentPadding = PaddingValues(10.dp)){
            items(items = employees){
            item->
            Rowcards(modifier = modifier, name = item)
    }
    }
        LazyColumn (){
            items(items = students){
                    item->
                Columncards(modifier = modifier, name = item)
            }
        }
}
}



@Composable
fun Rowcards(name: String, modifier: Modifier){
    Card (modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()
        .height(100.dp)
        .aspectRatio(1.5f),
        colors = CardDefaults.cardColors(contentColor = Color.White, containerColor = Color.Blue),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box (modifier = Modifier

            .padding(10.dp)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Text(text = name, fontSize = 20.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Serif)
        }
    }
}
@Composable
fun Columncards(name: String, modifier: Modifier){
    Card (modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()
        .wrapContentHeight()
        .aspectRatio(1.5f),
            colors = CardDefaults.cardColors(contentColor = Color.Red, containerColor = Color.Cyan,),
            elevation = CardDefaults.cardElevation(10.dp)) {
        Box (modifier = Modifier
            .padding(10.dp)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Text(text = name, fontSize = 24.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive)
        }
    }
}














