package com.reinertupaz.myjetpackapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.reinertupaz.myjetpackapp.ui.theme.MyJetpackAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyJetpackAppTheme {
                Scaffold(modifier =
                Modifier.fillMaxSize()
                ) { innerPadding ->
                    Greeting(
                        name = "Enneth",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    fun DoEnter()
    {
        /* TODO */
    }

    fun DoExit ()
    {
        this.finish()
    }
}

@Composable
fun Greeting(name: String,
             modifier: Modifier = Modifier) {
    val activity = LocalContext.current as MainActivity
    Column(
        Modifier
            .background(Color.Yellow)
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier,
            fontSize = 32.sp
        )
        Text(
            text = "Welcome!",
            modifier = modifier
        )
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = { activity.DoExit() }) {
                Text("Cancel")
            }
            Button(
                onClick = { activity.DoEnter() }) {
                Text("Enter")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyJetpackAppTheme {
        Greeting("Android")
    }
}