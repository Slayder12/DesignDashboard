package com.example.designdashboard

import com.example.designdashboard.models.GridViewModel

class DataBase {
    val list = mutableListOf(
        GridViewModel("Gismeteo", R.drawable.gis ),
        GridViewModel("Yandex", R.drawable.yandex),
        GridViewModel("Perplexity", R.drawable.perplexity),
        GridViewModel("Github", R.drawable.github),
        GridViewModel("Deeple", R.drawable.deeple),
        GridViewModel("YouTube", R.drawable.youtube)
    )
}