package com.example.compose_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.compose_navigation.navigation.SetupNavGraph
import com.example.compose_navigation.ui.theme.Compose_NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_NavigationTheme {
                SetupNavGraph(navController = rememberNavController())
                }
            }
        }
    }

@Preview
@Composable
fun screenPreview() {
Compose_NavigationTheme {
    SetupNavGraph(navController = rememberNavController())
    }
}