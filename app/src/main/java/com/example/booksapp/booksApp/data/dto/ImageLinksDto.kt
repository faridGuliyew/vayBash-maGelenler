package com.example.booksapp.booksApp.data.dto


import com.example.booksapp.booksApp.domain.model.ImageLinks
import com.google.gson.annotations.SerializedName

data class ImageLinksDto(
    @SerializedName("smallThumbnail")
    val smallThumbnail: String,
    @SerializedName("thumbnail")
    val thumbnail: String
) {
    fun toImageLinks() : ImageLinks{
        return ImageLinks(
            smallThumbnail = smallThumbnail,
            thumbnail = thumbnail
        )
    }
}