package com.example.simpleloginappui.screens.container

sealed class NavGraph(val route: String) {
    data object Welcome : NavGraph("welcome_screen")
    data object Login : NavGraph("login_screen")
    data object Registration : NavGraph("registration_screen")
    data object Home : NavGraph("home_screen")
}