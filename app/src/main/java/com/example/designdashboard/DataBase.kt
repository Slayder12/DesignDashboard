package com.example.designdashboard

import com.example.designdashboard.models.Item

class DataBase {
    val list = mutableListOf(
        Item("Home", R.drawable.baseline_home_24 ),
        Item("Profile", R.drawable.baseline_person_24),
        Item("Settings", R.drawable.baseline_settings_24),
        Item("Logout", R.drawable.baseline_logout_24),
//        Item("Chat", R.drawable.baseline_chat_24),
//        Item("Widgets", R.drawable.baseline_widgets_24)
    )
}