package com.example.booksapp.booksApp.presentation.main_fragments.home_fragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.booksapp.booksApp.domain.repository.BookInfoRepository
import com.example.booksapp.booksApp.domain.use_case.GetSearchResults
import com.example.booksapp.core.model.ApiResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeFragmentViewModel @Inject constructor(private val bookInfoRepository: BookInfoRepository) : ViewModel() {

    private val _searchResults = MutableStateFlow<ApiResponse?>(null)
    val searchResults = _searchResults.asStateFlow()

    fun onSearch(query : String) {
        viewModelScope.launch {
            bookInfoRepository.getSearchResults(query)
        }
    }
}