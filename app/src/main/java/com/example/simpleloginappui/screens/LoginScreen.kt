package com.example.simpleloginappui.screens

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.simpleloginappui.R
import com.example.simpleloginappui.components.AuthenticationScreenTemplate
import com.example.simpleloginappui.ui.theme.PrimaryPink
import com.example.simpleloginappui.ui.theme.PrimaryPinkBlended
import com.example.simpleloginappui.ui.theme.PrimaryPinkDark
import com.example.simpleloginappui.ui.theme.PrimaryPinkLight

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onLoginClicked: () -> Unit,
    onRegistrationClicked: () -> Unit
) {
    AuthenticationScreenTemplate(
        modifier = modifier,
        backgroundGradient = arrayOf(
            0f to PrimaryPinkBlended,
            1f to PrimaryPink
        ),
        imgRes = R.drawable.img_coder_m,
        title = "Welcome back!",
        subtitle = "Please, Log In.",
        mainActionButtonTitle = "Continue",
        secondaryActionButtonTitle = "Create an Account",
        mainActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryPinkDark,
            contentColor = Color.White
        ),
        secondaryActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryPinkLight,
            contentColor = Color.White
        ),
        actionButtonShadow = PrimaryPinkDark,
        onMainActionButtonClicked = onLoginClicked,
        onSecondaryActionButtonClicked = onRegistrationClicked
    )
}