package com.example.compose_navigation.ui.theme.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.compose_navigation.ui.theme.Compose_NavigationTheme
import com.example.compose_navigation.ui.theme.azulEscuro
import com.example.compose_navigation.ui.theme.preto

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {

    var text: String by rememberSaveable { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    )
    {
        Box(
            Modifier
                .height(130.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(

                            preto, azulEscuro
                        )
                    )
                )
                .fillMaxWidth()
        )
        Spacer(
            modifier = Modifier
                .height(50.dp)
        )



                Text(
                    text = "Bem-vindo à tela de Login",
                    modifier = Modifier
                        .fillMaxWidth() // preenche a tela
                        .padding(top = 8.dp),
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    letterSpacing = 1.sp
                )

                Spacer(
                    modifier = Modifier
                        .height(20.dp)
                )

                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    modifier = Modifier
                        .padding(top = 16.dp),
                    label =
                    {
                        Text(text = "Digite seu nome de usuário...")
                    },
                    textStyle = TextStyle(color = Color.Black)
                )

                Button(
                    onClick = {
                        val name: String = text.ifEmpty { "Cara" }
                        navController.navigate("home/$name")
                    }, modifier = Modifier
                        .padding(16.dp)
                )
                {
                    Text(text = "Navegar para Home")
                }
            }
}

@Preview
@Composable
fun LoginScreenPreview(){
    Compose_NavigationTheme {
        LoginScreen(navController = rememberNavController())
    }
}