package com.example.ui_common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(modifier: Modifier = Modifier.fillMaxSize(), action: ((UiAction) -> Unit)?) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colors.background
    ) {
        StatefulCounter(action = action)
    }
}

@Composable
fun StatefulCounter(modifier: Modifier = Modifier, action: ((UiAction) -> Unit)?) {
    StatelessCounter(
        onClick = action,
        modifier = modifier
    )
}

@Composable
fun StatelessCounter( onClick: ((UiAction) -> Unit)?, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFBB86FC)),
            onClick =  { onClick?.invoke(UiAction.OK) } ,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Add one")
        }
    }
}

@Composable
fun HelloWorldScreen() {
    Text(text = "HelloWorld")
}
