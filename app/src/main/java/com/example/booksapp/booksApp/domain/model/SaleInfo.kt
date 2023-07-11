package com.example.booksapp.booksApp.domain.model

import com.google.gson.annotations.SerializedName

data class SaleInfo(
    val buyLink: String?,
    val isEbook: Boolean,
    val saleability: String
)
