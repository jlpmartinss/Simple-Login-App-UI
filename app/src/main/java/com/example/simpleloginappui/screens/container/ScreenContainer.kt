package com.example.simpleloginappui.screens.container

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.simpleloginappui.screens.HomeScreen
import com.example.simpleloginappui.screens.LoginScreen
import com.example.simpleloginappui.screens.RegistrationScreen
import com.example.simpleloginappui.screens.WelcomeScreen

@Composable
fun ScreenContainer() {
    val navHost = rememberNavController()

    NavHost(navController = navHost, startDestination = NavGraph.Welcome.route) {
        composable(NavGraph.Welcome.route) {
            WelcomeScreen(
                onOpenLoginClicked = {
                    navHost.navigate(NavGraph.Login.route)
                }
            )
        }
        composable(NavGraph.Login.route) {
            LoginScreen(
                onLoginClicked = {
                    navHost.navigate(NavGraph.Home.route)
                },
                onRegistrationClicked = {
                    navHost.navigate(NavGraph.Registration.route)
                }
            )
        }
        composable(NavGraph.Registration.route) {
            RegistrationScreen()
        }
        composable(NavGraph.Home.route) {
            HomeScreen()
        }

    }
}