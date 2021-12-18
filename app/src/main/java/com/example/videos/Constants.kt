package com.example.videos

import com.example.videos.models.Category
import com.example.videos.models.Video

class Constants {
    companion object{
        val categories = arrayListOf(
            Category(Categories.Action.ordinal, R.string.action),
            Category(Categories.Comedy.ordinal, R.string.comedy),
            Category(Categories.Anime.ordinal, R.string.anime),
            Category(Categories.Drama.ordinal, R.string.drama),
            Category(Categories.Melodrama.ordinal, R.string.melodrama),
            Category(Categories.Horror.ordinal, R.string.horror),
            Category(Categories.Fantasy.ordinal, R.string.fantasy),
            Category(Categories.Cartoon.ordinal, R.string.cartoon),
        )

        val videos = arrayListOf(
            Video(Categories.Anime.ordinal, "Описание", "Название", "url"),
            Video(Categories.Anime.ordinal, "Описание", "Название", "url"),
            Video(Categories.Anime.ordinal, "Описание", "Название", "url"),

            Video(Categories.Action.ordinal, "Описание", "Название", "url"),
            Video(Categories.Action.ordinal, "Описание", "Название", "url"),
            Video(Categories.Action.ordinal, "Описание", "Название", "url"),

            Video(Categories.Cartoon.ordinal, "Описание", "Название", "url"),
            Video(Categories.Cartoon.ordinal, "Описание", "Название", "url"),
            Video(Categories.Cartoon.ordinal, "Описание", "Название", "url"),

            Video(Categories.Horror.ordinal, "Описание", "Название", "url"),
            Video(Categories.Horror.ordinal, "Описание", "Название", "url"),
            Video(Categories.Horror.ordinal, "Описание", "Название", "url"),

        )
    }
}

enum class Categories(value: Int){
    Comedy(1),
    Anime(2),
    Drama(3),
    Melodrama(4),
    Action(5),
    Horror(6),
    Fantasy(7),
    Cartoon(8)
}