package com.example.booksapp.booksApp.data.dto


import com.example.booksapp.booksApp.domain.model.SearchInfo
import com.google.gson.annotations.SerializedName

data class SearchInfoDto(
    @SerializedName("textSnippet")
    val textSnippet: String
){
    fun toSearchInfo() : SearchInfo{
        return SearchInfo(
            textSnippet = textSnippet
        )
    }
}