package com.jetpackcompose.loginapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.jetpackcompose.loginapp.ui.screen.container.ScreenContainer
import com.jetpackcompose.loginapp.ui.screen.login.LoginScreen
import com.jetpackcompose.loginapp.ui.screen.registration.RegistrationScreen
import com.jetpackcompose.loginapp.ui.theme.LoginAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginAppTheme {
                ScreenContainer()
            }
        }
    }
}

//@Preview
//@Composable
//fun GreetingPreview() {
//    LoginAppTheme {
//        RegistrationScreen(navController)
//    }
//}