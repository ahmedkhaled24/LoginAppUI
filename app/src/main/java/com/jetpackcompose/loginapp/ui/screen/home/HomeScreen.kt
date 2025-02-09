package com.jetpackcompose.loginapp.ui.screen.home

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.jetpackcompose.loginapp.ui.theme.Blue
import com.jetpackcompose.loginapp.ui.theme.Orange
import com.jetpackcompose.loginapp.utils.KonfettiUtil
import nl.dionsegijn.konfetti.compose.KonfettiView

@Composable
fun HomeScreen(navController: NavHostController) {

    val activity = (LocalContext.current as? Activity)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0f to Blue,
                    1f to Orange
                )
            )
    ) {

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Congratulations",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Text(
                text = "\uD83E\uDD73",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.weight(1f))


        Button(
            onClick = {
                activity?.finish()
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Blue,
            ),
        ) {
            Text(
                text = "Finish",
                style = MaterialTheme.typography.titleMedium,
//                color = Color.White
            )
        }
    }

    KonfettiView(
        modifier = Modifier.fillMaxSize(),
        parties = KonfettiUtil.parade()
    )

}