package com.example.simpleloginappui.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simpleloginappui.ui.components.ActionButton
import com.example.simpleloginappui.ui.theme.PrimaryGreen
import com.example.simpleloginappui.ui.theme.PrimaryGreenDark
import com.example.simpleloginappui.ui.theme.PrimaryPinkDark
import com.example.simpleloginappui.ui.theme.PrimaryViolet
import com.example.simpleloginappui.ui.util.KonfettiUtil
import nl.dionsegijn.konfetti.compose.KonfettiView

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onRestartFlowClicked: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0f to PrimaryViolet,
                    1f to PrimaryGreen
                )
            )
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Greetings()
        Spacer(modifier = Modifier.weight(1f))
        ActionButton(
            onClick = onRestartFlowClicked,
            text = "Press to restart",
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryGreenDark,
                contentColor = Color.White
            ),
            shadowColor = PrimaryPinkDark,
            isNavigationArrowVisible = false,
            modifier = Modifier.padding(24.dp)
        )
    }
    KonfettiView(
        modifier = Modifier.fillMaxSize(),
        parties = KonfettiUtil.parade()
    )
}

@Composable
fun Greetings(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Congratulations!",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Text(
            text = "\uD83E\uDD73",
            style = MaterialTheme.typography.headlineMedium
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPrev() {
    HomeScreen(onRestartFlowClicked = {})
}