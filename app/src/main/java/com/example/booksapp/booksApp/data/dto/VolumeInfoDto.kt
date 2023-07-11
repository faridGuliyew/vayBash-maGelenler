package com.example.booksapp.booksApp.data.dto


import com.example.booksapp.booksApp.domain.model.VolumeInfo
import com.google.gson.annotations.SerializedName

data class VolumeInfoDto(
    @SerializedName("allowAnonLogging")
    val allowAnonLogging: Boolean,
    @SerializedName("authors")
    val authors: List<String>,
    @SerializedName("canonicalVolumeLink")
    val canonicalVolumeLink: String,
    @SerializedName("categories")
    val categories: List<String>?,
    @SerializedName("contentVersion")
    val contentVersion: String,
    @SerializedName("description")
    val description: String?,
    @SerializedName("imageLinks")
    val imageLinks: ImageLinksDto?,
    @SerializedName("industryIdentifiers")
    val industryIdentifiers: List<IndustryIdentifierDto>,
    @SerializedName("infoLink")
    val infoLink: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("maturityRating")
    val maturityRating: String,
    @SerializedName("pageCount")
    val pageCount: Int,
    @SerializedName("panelizationSummary")
    val panelizationSummary: PanelizationSummaryDto?,
    @SerializedName("previewLink")
    val previewLink: String,
    @SerializedName("printType")
    val printType: String,
    @SerializedName("publishedDate")
    val publishedDate: String,
    @SerializedName("publisher")
    val publisher: String?,
    @SerializedName("readingModes")
    val readingModes: ReadingModesDto,
    @SerializedName("subtitle")
    val subtitle: String?,
    @SerializedName("title")
    val title: String
) {
    fun toVolumeInfo() : VolumeInfo{
        return VolumeInfo(
            authors = authors,
            categories = categories,
            description = description,
            imageLinks = imageLinks?.toImageLinks(),
            infoLink = infoLink,
            language = language,
            maturityRating = maturityRating,
            pageCount = pageCount,
            previewLink = previewLink,
            publishedDate = publishedDate,
            publisher = publisher,
            subtitle = subtitle,
            title = title
        )
    }
}