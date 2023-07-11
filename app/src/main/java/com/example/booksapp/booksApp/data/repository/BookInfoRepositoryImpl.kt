package com.example.booksapp.booksApp.data.repository

import android.util.Log
import com.example.booksapp.booksApp.data.dto.BookSearchInfoDto
import com.example.booksapp.booksApp.data.remote.BookInfoApi
import com.example.booksapp.booksApp.domain.repository.BookInfoRepository
import com.example.booksapp.core.model.ApiResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class BookInfoRepositoryImpl @Inject constructor(private val bookInfoApi: BookInfoApi) : BookInfoRepository{
    override fun getSearchResults(query: String): Flow<ApiResponse> =
        flow {
            Log.e("DATA LAYER","isLoading!")
            emit(ApiResponse.Loading)
            try {
                val request = bookInfoApi.getSearchedBooks(query)
                if (request.isSuccessful){
                    val body = request.body()?:BookSearchInfoDto(emptyList(),"",0)
                    emit(ApiResponse.Success(body.toBookSearchInfo()))
                    Log.e("DATA LAYER","SUCESS!")
                }else{
                    emit(ApiResponse.Error("Unexpected error occurred"))
                    Log.e("DATA LAYER","error1")
                }
            }catch (e:Exception){
                emit(ApiResponse.Error(e.localizedMessage?:"Something went wrong. Please check your internet connection!"))
                Log.e("DATA LAYER","error2!")
            }
        }
}