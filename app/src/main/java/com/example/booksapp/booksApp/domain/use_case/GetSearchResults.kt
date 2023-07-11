package com.example.booksapp.booksApp.domain.use_case

import android.util.Log
import com.example.booksapp.booksApp.domain.repository.BookInfoRepository
import com.example.booksapp.core.model.ApiResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class GetSearchResults @Inject constructor(private val bookInfoRepository: BookInfoRepository) {

    operator fun invoke(query : String) : Flow<ApiResponse> {
        Log.e("DOMAIN LAYER","requested!")
        if (query.isBlank()){
            return flow {  }
        }
        return bookInfoRepository.getSearchResults(query)
    }
}