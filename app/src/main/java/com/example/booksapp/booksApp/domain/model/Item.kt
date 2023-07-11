package com.example.booksapp.booksApp.domain.model

import com.example.booksapp.booksApp.data.dto.SaleInfoDto
import com.example.booksapp.booksApp.data.dto.SearchInfoDto
import com.example.booksapp.booksApp.data.dto.VolumeInfoDto

data class Item(
    val id: String,
    val saleInfo: SaleInfo,
    val searchInfo: SearchInfo?,
    val volumeInfo: VolumeInfo
)
