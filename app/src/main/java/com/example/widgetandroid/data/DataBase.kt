package com.example.widgetandroid.data

import com.example.widgetandroid.R

data class DataBase(
    val message : String ,
    val painter : Int
)

val dataBaseListOf : MutableList<DataBase> = mutableListOf<DataBase>(

    DataBase("Computer",R.drawable.baseline_computer_24),
    DataBase("Android Phone",R.drawable.baseline_phone_android_24),
    DataBase("Ios Phone",R.drawable.baseline_phone_iphone_24),
    DataBase("Android Tablet",R.drawable.baseline_tablet_android_24),
    DataBase("Ios Tablet",R.drawable.baseline_tablet_mac_24),
    DataBase("Android Watch",R.drawable.baseline_watch_24)

)
