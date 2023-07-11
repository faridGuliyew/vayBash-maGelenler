package com.example.booksapp.booksApp.data.dto


import com.example.booksapp.booksApp.domain.model.BookSearchInfo
import com.google.gson.annotations.SerializedName

data class BookSearchInfoDto(
    @SerializedName("items")
    val items: List<ItemDto>,
    @SerializedName("kind")
    val kind: String,
    @SerializedName("totalItems")
    val totalItems: Int
) {
    fun toBookSearchInfo() : BookSearchInfo{
        return BookSearchInfo(
            items = items.map { it.toItem() },
            totalItems = totalItems
        )
    }
}