package com.example.booksapp.booksApp.data.dto


import com.google.gson.annotations.SerializedName

data class PdfDto(
    @SerializedName("acsTokenLink")
    val acsTokenLink: String?,
    @SerializedName("isAvailable")
    val isAvailable: Boolean
)