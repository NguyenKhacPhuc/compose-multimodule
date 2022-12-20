package com.example.ui_common

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

class AndroidUiKitImpl(override val navigateNavController: NavHostController) : AndroidUiKit {
    private var mainScreenUiAction: ((UiAction) -> Unit) ? = null
    private var splashScreenUiAction: ((UiAction) -> Unit) ? = null
    @Composable
    override fun Init() {
        NavHost(navController = navigateNavController, startDestination = SplashScreen.key) {
            composable(SplashScreen.key) {
                val actionUi = remember {splashScreenUiAction}
                if (actionUi != null)
                SplashScreen.Composable(actionUi)
            }

            composable(MainScreen.key) {
                val actionUi = remember {mainScreenUiAction}
                if (actionUi != null) {
                    MainScreen.Composable(action = actionUi)
                }
            }
            composable(HelloWorldScreen.key) {
                HelloWorldScreen.Composable(action = null )
            }
        }
    }

    override fun showMainScreen(action: (UiAction) -> Unit) {
        mainScreenUiAction = action
        navigateNavController.navigate(MainScreen.key)
    }

    override fun showSplashScreen(action: (UiAction) -> Unit) {
        splashScreenUiAction = action
        navigateNavController.navigate(SplashScreen.key)
    }

    override fun showHelloWorldScreen() {
        navigateNavController.navigate(HelloWorldScreen.key)
    }
}