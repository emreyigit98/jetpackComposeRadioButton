package com.example.widgetandroid

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BasicTopAppBar(title: @Composable () -> Unit, colorContainer: Color, titleColor: Color) {

    TopAppBar(
        title = title,
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = colorContainer,
            titleContentColor = titleColor
        )
    )
}
