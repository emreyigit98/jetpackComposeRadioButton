package com.example.widgetandroid

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.widgetandroid.data.DataBase

@Composable
fun CardRadio(number : MutableState<Int> , list : List<DataBase> ) {
    list.forEachIndexed { index, t ->
        Card(
            modifier = Modifier.padding(all = 10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray
            )
        ) {
            Row(
                modifier = Modifier
                    .padding(all = 10.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Row {
                    RadioButton(
                        selected = t == list[number.value],

                        onClick = {
                        number.value = index
                    })
                }
                Row {
                    Text(text = t.message)
                }
                Row {
                    Image(
                        painter = painterResource(id = t.painter),
                        contentDescription = null
                    )
                }
            }
        }
    }
}
