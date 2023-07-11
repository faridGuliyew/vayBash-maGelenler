package com.example.booksapp.booksApp.data.dto


import com.google.gson.annotations.SerializedName

data class PanelizationSummaryDto(
    @SerializedName("containsEpubBubbles")
    val containsEpubBubbles: Boolean,
    @SerializedName("containsImageBubbles")
    val containsImageBubbles: Boolean
)