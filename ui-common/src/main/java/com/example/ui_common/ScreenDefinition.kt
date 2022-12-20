package com.example.ui_common

import androidx.compose.runtime.Composable

interface Screen {
    val key: String
    @Composable
    fun Composable(action: ((UiAction) -> Unit)?)
}

internal object MainScreen: Screen {
    override val key: String
        get() = "main_screen"

    @Composable
    override fun Composable(action: ((UiAction) -> Unit)?) {
        MainScreen(action = action)
    }
}

internal object SplashScreen: Screen {
    override val key: String
        get() = "splash_screen"

    @Composable
    override fun Composable(action: ((UiAction) -> Unit)?) {}
}

internal object HelloWorldScreen: Screen {
    override val key: String
        get() = "hello_world_screen"

    @Composable
    override fun Composable(action: ((UiAction) -> Unit)?) {
        HelloWorldScreen()
    }
}