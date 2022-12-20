package com.example.jetpackcomposearchsolver

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.ui_common.AndroidUiKitImpl
import com.example.ui_common.MainScreen
import com.example.ui_common.UiAction
import com.example.ui_common.theme.MainActivityTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainActivityTheme {
                // A surface container using the 'backgroundMainScreen' the theme
                val androidUiKit = AndroidUiKitImpl(rememberNavController())
                androidUiKit.Init()
                androidUiKit.showMainScreen {
                    Log.d("UiAction", it.name)
                    if (it == UiAction.OK) {
                        androidUiKit.showHelloWorldScreen()
                    }
                }
            }
        }
    }
}