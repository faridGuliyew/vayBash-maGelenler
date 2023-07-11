package com.example.booksapp.booksApp.domain.repository

import com.example.booksapp.booksApp.domain.model.BookSearchInfo
import com.example.booksapp.core.model.ApiResponse
import kotlinx.coroutines.flow.Flow

interface BookInfoRepository {

    fun getSearchResults(query : String) : Flow<ApiResponse>
}