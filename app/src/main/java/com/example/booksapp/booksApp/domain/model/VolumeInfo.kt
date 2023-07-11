package com.example.booksapp.booksApp.domain.model

import com.example.booksapp.booksApp.data.dto.ImageLinksDto
import com.example.booksapp.booksApp.data.dto.IndustryIdentifierDto
import com.example.booksapp.booksApp.data.dto.PanelizationSummaryDto
import com.example.booksapp.booksApp.data.dto.ReadingModesDto
import com.google.gson.annotations.SerializedName

data class VolumeInfo(

    val authors: List<String>,
    val categories: List<String>?,
    val description: String?,
    val imageLinks: ImageLinks?,
    val infoLink: String,
    val language: String,
    val maturityRating: String,
    val pageCount: Int,
    val previewLink: String,
    val publishedDate: String,
    val publisher: String?,
    val subtitle: String?,
    val title: String
)
