package com.example.booksapp.booksApp.data.dto


import com.google.gson.annotations.SerializedName

data class EpubDto(
    @SerializedName("acsTokenLink")
    val acsTokenLink: String?,
    @SerializedName("downloadLink")
    val downloadLink: String?,
    @SerializedName("isAvailable")
    val isAvailable: Boolean
)