package com.example.booksapp.core.model

sealed class ApiResponse {
    object Loading : ApiResponse()
    data class Error (val message : String) : ApiResponse()
    data class Success <T> (val data : T) : ApiResponse()
}
