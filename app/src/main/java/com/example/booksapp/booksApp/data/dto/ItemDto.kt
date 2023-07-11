package com.example.booksapp.booksApp.data.dto


import com.example.booksapp.booksApp.domain.model.Item
import com.google.gson.annotations.SerializedName

data class ItemDto(
    @SerializedName("accessInfo")
    val accessInfo: AccessInfoDto,
    @SerializedName("etag")
    val etag: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("kind")
    val kind: String,
    @SerializedName("saleInfo")
    val saleInfo: SaleInfoDto,
    @SerializedName("searchInfo")
    val searchInfo: SearchInfoDto?,
    @SerializedName("selfLink")
    val selfLink: String,
    @SerializedName("volumeInfo")
    val volumeInfo: VolumeInfoDto
) {
    fun toItem() : Item {
        return Item(
            id = id,
            saleInfo = saleInfo.toSaleInfo(),
            searchInfo = searchInfo?.toSearchInfo(),
            volumeInfo = volumeInfo.toVolumeInfo()
        )
    }
}