package com.example.widgetandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.widgetandroid.ui.theme.WidgetAndroidTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WidgetAndroidTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {
                    CardRadioButton()
                }
            }
        }
    }
}
