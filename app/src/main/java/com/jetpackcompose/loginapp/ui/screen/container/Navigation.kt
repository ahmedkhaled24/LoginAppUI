package com.jetpackcompose.loginapp.ui.screen.container

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jetpackcompose.loginapp.ui.screen.home.HomeScreen
import com.jetpackcompose.loginapp.ui.screen.login.LoginScreen
import com.jetpackcompose.loginapp.ui.screen.registration.RegistrationScreen
import com.jetpackcompose.loginapp.ui.screen.welcome.WelcomeScreen

@Composable
fun ScreenContainer() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.Welcome.route) {
        composable(route = Screens.Home.route) {
            HomeScreen(navController)
        }

        composable(route = Screens.Login.route) {
            LoginScreen(navController)
        }

        composable(route = Screens.Registration.route) {
            RegistrationScreen(navController)
        }

        composable(route = Screens.Welcome.route) {
            WelcomeScreen(navController)
        }
    }
}