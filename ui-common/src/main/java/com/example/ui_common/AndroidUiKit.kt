package com.example.ui_common

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

interface AndroidUiKit {
    val navigateNavController: NavHostController

    @Composable
    fun Init()
    fun showMainScreen(action: (UiAction) -> Unit)
    fun showSplashScreen(action: (UiAction) -> Unit)
    fun showHelloWorldScreen()
}