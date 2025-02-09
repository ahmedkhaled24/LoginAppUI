package com.jetpackcompose.loginapp.ui.screen.registration

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.jetpackcompose.loginapp.R
import com.jetpackcompose.loginapp.ui.screen.container.Screens
import com.jetpackcompose.loginapp.ui.theme.Blue
import com.jetpackcompose.loginapp.ui.theme.DarkTextColor
import com.jetpackcompose.loginapp.ui.theme.Orange
import com.jetpackcompose.loginapp.ui.theme.Purple90
import kotlinx.coroutines.launch

//@Preview
@Composable
fun RegistrationScreen(navController: NavHostController) {

    val backgroundGradient = arrayOf(0f to Blue, 1f to Orange)
    val scrollState = rememberScrollState()
    val coroutineScope = rememberCoroutineScope()
    val keyboardHeight = WindowInsets.ime.getBottom(LocalDensity.current)

    LaunchedEffect(keyboardHeight) {
        coroutineScope.launch {
            scrollState.scrollBy(keyboardHeight.toFloat())
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(*backgroundGradient))
            .systemBarsPadding()
            .verticalScroll(scrollState)
            .imePadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painterResource(R.drawable.img_registration), contentDescription = null)
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Let's Get Started",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge,
            color = DarkTextColor,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = "Create an Account",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineMedium,
            color = DarkTextColor,
            fontWeight = FontWeight.Black
        )

        Spacer(modifier = Modifier.height(24.dp))

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            value = "",
            onValueChange = { },
            visualTransformation = VisualTransformation.None,
            singleLine = true,
            shape = RoundedCornerShape(percent = 50),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Transparent,
                focusedTextColor = DarkTextColor,
                unfocusedTextColor = DarkTextColor,
                unfocusedPlaceholderColor = DarkTextColor,
                focusedPlaceholderColor = DarkTextColor,
                focusedLeadingIconColor = DarkTextColor,
                unfocusedLeadingIconColor = DarkTextColor,
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White
            ),
            textStyle = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.Medium
            ),
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_person),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            },
            placeholder = {
                Text(text = "abc@example.com", color = Color.LightGray)
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            value = "",
            onValueChange = { },
            visualTransformation = VisualTransformation.None,
            singleLine = true,
            shape = RoundedCornerShape(percent = 50),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Transparent,
                focusedTextColor = DarkTextColor,
                unfocusedTextColor = DarkTextColor,
                unfocusedPlaceholderColor = DarkTextColor,
                focusedPlaceholderColor = DarkTextColor,
                focusedLeadingIconColor = DarkTextColor,
                unfocusedLeadingIconColor = DarkTextColor,
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White
            ),
            textStyle = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.Medium
            ),
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_key),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            },
            placeholder = {
                Text(text = "*********", color = Color.LightGray)
            }
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                navController.navigate(Screens.Home.route)
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(horizontal = 24.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Purple90,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Create Account",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold
            )
        }

        Separator(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .height(62.dp)
        )

        Button(
            onClick = {
                navController.navigate(Screens.Login.route)
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(horizontal = 24.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Purple90,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Login",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold
            )
        }
    }

}

@Composable
private fun Separator(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        DashedLine(
            modifier = Modifier.weight(weight = 0.5f)
        )
        Text(
            text = "Or",
            style = MaterialTheme.typography.labelMedium,
            color = Color.White
        )
        DashedLine(
            modifier = Modifier.weight(weight = 0.5f)
        )
    }
}

@Composable
private fun DashedLine(
    modifier: Modifier = Modifier
) {
    Canvas(modifier = modifier) {
        drawLine(
            color = Color.White,
            start = Offset(0f, 0f),
            end = Offset(size.width, 0f),
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(8f, 8f), 0f),
            cap = StrokeCap.Square,
            strokeWidth = 1.dp.toPx()
        )
    }
}