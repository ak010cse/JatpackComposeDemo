package com.arvind.jatpackcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arvind.jatpackcomposedemo.ui.theme.JatpackComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JatpackComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
   /* Column (
        horizontalAlignment = Alignment.CenterHorizontally,

        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
        ){
        for (i in 1..10){

            Text(
                text = "Other Something text",
                fontSize= 20.sp,
                color = Color.Blue
            )

            Icon(imageVector = Icons.Default.AddCircle, contentDescription =null )

        }
    }*/

   /* LazyRow(modifier = Modifier.fillMaxSize()){
        items(10){i ->


            Icon(imageVector = Icons.Default.AddCircle,
                contentDescription =null,
            modifier = Modifier.size(100.dp))

        }
    }*/
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()){
        items(10){i ->
            Icon(imageVector = Icons.Default.AddCircle, contentDescription =null )

            Text(
                text = "Other Something text",
                fontSize= 20.sp,
                color = Color.Blue
            )


        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JatpackComposeDemoTheme {
        Greeting("Android")
    }
}