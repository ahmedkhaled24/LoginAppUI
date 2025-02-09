package com.jetpackcompose.loginapp.ui.screen.container

sealed class Screens(val route: String) {
    data object Welcome: Screens(route = "welcome_screen")
    data object Login: Screens(route = "login_screen")
    data object Registration: Screens(route = "registration_screen")
    data object Home: Screens(route = "home_screen")
}