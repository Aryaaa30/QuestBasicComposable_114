package com.example.composablelayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.RegisterReceiverFlags
import com.example.composablelayout.ui.theme.ComposableLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposableLayoutTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Register(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Register(modifier: Modifier = Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize().padding()){

        Text("Login",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(5.dp))

        Text("Ini Adalah Halaman Login")
        Spacer(modifier = Modifier.padding(10.dp))
        Image(painter = painterResource(id = R.drawable.umy),
            contentDescription = "",
            modifier = Modifier.padding(5.dp)
                .size(250.dp)
                .clip(CircleShape))

        Text("Nama")
        Text("Arya Anugrah", color = Color.Red,
            fontWeight = FontWeight.Bold)
        Text("20220140114",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold)

        Image(painter = painterResource(id = R.drawable.arya),
            contentDescription = "",
            modifier = Modifier.padding(15.dp))
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposableLayoutTheme {
        Register()
    }
}