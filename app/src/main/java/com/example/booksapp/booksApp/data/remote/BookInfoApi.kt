package com.example.booksapp.booksApp.data.remote

import com.example.booksapp.booksApp.data.dto.BookSearchInfoDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface BookInfoApi {

    //search request
    @GET("volumes")
    suspend fun getSearchedBooks(@Query("q") query : String) : Response<BookSearchInfoDto>
}