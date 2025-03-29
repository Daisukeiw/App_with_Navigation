package com.example.compose_navigation.ui.theme.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.compose_navigation.data.User
import com.example.compose_navigation.ui.theme.Compose_NavigationTheme
import com.example.compose_navigation.ui.theme.azulEscuro
import com.example.compose_navigation.ui.theme.preto

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(user: User, navController: NavController) {
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
        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Bem-vindo à tela Home",
            modifier = Modifier
                .fillMaxWidth() // preenche a tela
                .padding(top = 8.dp),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            letterSpacing = 1.sp
        )

        Text(
            text = "Olá, ${user.name}!",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            modifier = Modifier
                .padding(top = 16.dp)
        )
        Text(
            text = "\"${user.bio}\"",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 24.dp)

        )

        Text(
            text = "Idade: ${user.age}",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 16.dp)
        )

        Text(
            text = "E-mail: ${user.email}",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 16.dp)
        )

        Text(
            text = "Data de Nascimento: ${user.registerDate}",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 16.dp)
        )

        Text(
            text = "Série: ${user.curso}",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 16.dp)
        )

        Text(
            text = "Pontuação: ${user.score}/100",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 16.dp)
        )

        Button(
            onClick = {
                navController.popBackStack(
                    route = "login", // Nome da rota da tela inicial
                    inclusive = false // false mantém a tela "login" na pilha
                )
            },
            modifier = Modifier
                .padding(16.dp)
                .height(50.dp) // altura do botão
                .width(200.dp) // largura do botão
        ) {
            Text(text = "Voltar para Login")
        }

    }
}