package com.jetpackcompose.loginapp.ui.screen.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.jetpackcompose.loginapp.R
import com.jetpackcompose.loginapp.ui.components.ActionButton
import com.jetpackcompose.loginapp.ui.screen.container.Screens
import com.jetpackcompose.loginapp.ui.theme.Blue
import com.jetpackcompose.loginapp.ui.theme.DarkTextColor
import com.jetpackcompose.loginapp.ui.theme.Orange
import com.jetpackcompose.loginapp.ui.theme.Purple90

@Composable
fun WelcomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0f to Blue,
                    1f to Orange
                )
            )
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.img_welcome),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(top = 32.dp)
        )
        Spacer(modifier = Modifier.height(48.dp))
        Text(
            text = "Let's start codding!",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Black,
            modifier = Modifier.padding(horizontal = 24.dp),
            color = DarkTextColor
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Create a beautiful Login App using\nKotlin, Jetpack Compose, and Material3",
            modifier = Modifier.padding(horizontal = 24.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge,
            color = DarkTextColor
        )
        Spacer(modifier = Modifier.weight(weight = 1f))
        ActionButton(
            text = "Next",
            isNavigationArrowVisible = true,
            onClicked = { navController.navigate(Screens.Login.route) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Purple90,
                contentColor = Color.White,
            ),
            modifier = Modifier.padding(24.dp)
        )
    }
}