package com.example.booksapp.booksApp.data.dto


import com.example.booksapp.booksApp.domain.model.SaleInfo
import com.google.gson.annotations.SerializedName

data class SaleInfoDto(
    @SerializedName("buyLink")
    val buyLink: String?,
    @SerializedName("country")
    val country: String,
    @SerializedName("isEbook")
    val isEbook: Boolean,
    @SerializedName("saleability")
    val saleability: String
) {
    fun toSaleInfo() : SaleInfo{
        return SaleInfo(
            buyLink = buyLink,
            isEbook = isEbook,
            saleability = saleability
        )
    }
}