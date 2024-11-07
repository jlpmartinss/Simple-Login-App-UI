package com.example.simpleloginappui.ui.screens.container

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.simpleloginappui.ui.screens.HomeScreen
import com.example.simpleloginappui.ui.screens.LoginScreen
import com.example.simpleloginappui.ui.screens.RegistrationScreen
import com.example.simpleloginappui.ui.screens.WelcomeScreen

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
            RegistrationScreen(
                onLoginClicked = {
                    navHost.navigate(NavGraph.Login.route)
                },
                onRegisterClicked = {
                    navHost.navigate(NavGraph.Home.route)
                }
            )
        }
        composable(NavGraph.Home.route) {
            HomeScreen(
                onRestartFlowClicked = {
                    navHost.navigate(NavGraph.Welcome.route)
                }
            )
        }
    }
}