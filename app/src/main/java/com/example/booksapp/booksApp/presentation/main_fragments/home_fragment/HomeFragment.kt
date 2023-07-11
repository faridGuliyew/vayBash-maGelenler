package com.example.booksapp.booksApp.presentation.main_fragments.home_fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.booksapp.R
import com.example.booksapp.booksApp.domain.model.BookSearchInfo
import com.example.booksapp.booksApp.presentation.base.BaseFragment
import com.example.booksapp.core.model.ApiResponse
import com.example.booksapp.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.onEach


@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private val viewModel : HomeFragmentViewModel by viewModels()

    override fun onViewCreatedLight() {
        observe()
        //test
        viewModel.onSearch("f")
    }


    private fun observe(){
        with(viewModel){
            searchResults.onEach {
                when(it){
                    is ApiResponse.Loading->{
                        Log.e("HOMEFRAGMENT","loading")}
                    is ApiResponse.Error->{
                        Log.e("HOMEFRAGMENT",it.message)
                    }
                    is ApiResponse.Success<*> -> {
                        Log.e("HOMEFRAGMENT",it.data.toString())
                    }
                    else->Log.e("HOMEFRAGMENT","ELSE BRANCH -> Fuck this shit!")
                }
            }
        }
    }
}