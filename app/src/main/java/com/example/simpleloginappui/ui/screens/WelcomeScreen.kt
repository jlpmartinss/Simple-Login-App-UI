package com.example.simpleloginappui.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simpleloginappui.R
import com.example.simpleloginappui.ui.components.ActionButton
import com.example.simpleloginappui.ui.theme.DarkTextColor
import com.example.simpleloginappui.ui.theme.PrimaryPinkBlended
import com.example.simpleloginappui.ui.theme.PrimaryYellow
import com.example.simpleloginappui.ui.theme.PrimaryYellowDark
import com.example.simpleloginappui.ui.theme.PrimaryYellowLight

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier,
    onOpenLoginClicked: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0f to PrimaryPinkBlended,
                    0.6f to PrimaryYellowLight,
                    1f to PrimaryYellow
                )
            )

            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_welcome),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(top = 32.dp),
        )
        Spacer(modifier = Modifier.height(24.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(horizontal = 24.dp)
        ) {
            Text(
                text = "Let's start coding!",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Black,
                color = DarkTextColor

            )
            Text(
                text = "Create a beautiful Login App using\nKotlin, Jetpack Compose, and Material3",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge,
                color = DarkTextColor
            )
            Spacer(modifier = Modifier.weight(1f))
            ActionButton(
                text = "Next",
                onClick = onOpenLoginClicked,
                colors = ButtonDefaults.buttonColors(
                    containerColor = PrimaryYellowDark,
                    contentColor = DarkTextColor
                ),
                shadowColor = PrimaryYellowDark,
                modifier = Modifier.padding(24.dp),
                isNavigationArrowVisible = true
            )
        }
    }
}

@Preview
@Composable
private fun WelcomeScreenPrev() {
    WelcomeScreen(onOpenLoginClicked = {})
}