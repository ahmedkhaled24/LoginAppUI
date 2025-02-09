package com.jetpackcompose.loginapp.ui.screen.login

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.jetpackcompose.loginapp.R
import com.jetpackcompose.loginapp.ui.components.AuthenticationScreenTemplate
import com.jetpackcompose.loginapp.ui.screen.container.Screens
import com.jetpackcompose.loginapp.ui.theme.Blue
import com.jetpackcompose.loginapp.ui.theme.Orange
import com.jetpackcompose.loginapp.ui.theme.Purple90

@Composable
fun LoginScreen(navController: NavHostController) {
    AuthenticationScreenTemplate(
        modifier = Modifier,
        backgroundGradient = arrayOf(
            0f to Blue,
            1f to Orange
        ),
        imgRes = R.drawable.img_login,
        title = "Welcome back!",
        subtitle = "Please, Log In.",
        mainActionButtonTitle = "Continue",
        secondaryActionButtonTitle = "Create an Account",
        mainActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = Purple90,
            contentColor = Color.White
        ),
        secondaryActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = Purple90,
            contentColor = Color.White
        ),
        onMainActionButtonClicked = {
            navController.navigate(Screens.Home.route) },
        onSecondaryActionButtonClicked = { navController.navigate(Screens.Registration.route) }
    )
}