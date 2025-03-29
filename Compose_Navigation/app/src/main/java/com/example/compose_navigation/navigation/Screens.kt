package com.example.compose_navigation.navigation

import com.example.compose_navigation.navigation.Routes.HOME_ROUTE
import com.example.compose_navigation.navigation.Routes.LOGIN_ROUTE

sealed class Screens(val route: String) {
    object LoginScreen : Screens(LOGIN_ROUTE)
    object HomeScreen : Screens(HOME_ROUTE)
}