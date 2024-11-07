package com.example.simpleloginappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.simpleloginappui.ui.screens.container.ScreenContainer
import com.example.simpleloginappui.ui.theme.SimpleLoginAppUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleLoginAppUITheme {
                ScreenContainer()
            }
        }
    }
}
