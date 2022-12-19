package com.example.jetpackcomposearchsolver

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.ui_common.theme.MainActivityTheme
import com.example.ui_common.MainScreen

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainActivityTheme {
                // A surface container using the 'backgroundMainScreen' the theme
                MainScreen()
            }
        }
    }
}