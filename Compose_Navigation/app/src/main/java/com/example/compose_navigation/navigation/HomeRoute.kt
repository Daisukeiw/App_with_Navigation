package com.example.compose_navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.compose_navigation.data.User
import com.example.compose_navigation.data.getUserData
import com.example.compose_navigation.ui.theme.screen.HomeScreen


@Composable
fun HomeRoute(userName: String, navController: NavController) {
    val user: User = getUserData(userName = userName)

    HomeScreen(user = user, navController = navController)
}
