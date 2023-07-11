package com.example.booksapp.booksApp.data.dto


import com.google.gson.annotations.SerializedName

data class ReadingModesDto(
    @SerializedName("image")
    val image: Boolean,
    @SerializedName("text")
    val text: Boolean
)