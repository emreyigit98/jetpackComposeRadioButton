package com.example.widgetandroid

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.radioButton.R
import com.example.widgetandroid.data.dataBaseListOf
import com.example.widgetandroid.ui.theme.WidgetAndroidTheme


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardRadioButton() {

    val stateResult = remember { mutableStateOf(0) }
    val topAppBarColor = Color(0xFF227172)
    val titleColor = Color(0xFFFFFFF)
    val scroll = rememberScrollState()


    WidgetAndroidTheme(darkTheme = false) {
        Surface {
            Scaffold(
                topBar = {
                    BasicTopAppBar(
                        title = { Text(text = stringResource(id = R.string.top_app_bar_name)) },
                        colorContainer = topAppBarColor, titleColor
                    )
                },
                content = {

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 80.dp)
                            .verticalScroll(scroll)
                    ) {

                        CardRadio(number = stateResult, list = dataBaseListOf)

                    }
                }
            )
        }
    }
}
