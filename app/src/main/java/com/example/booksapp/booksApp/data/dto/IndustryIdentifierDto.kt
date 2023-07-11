package com.example.booksapp.booksApp.data.dto


import com.google.gson.annotations.SerializedName

data class IndustryIdentifierDto(
    @SerializedName("identifier")
    val identifier: String,
    @SerializedName("type")
    val type: String
)