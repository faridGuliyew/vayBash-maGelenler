package com.example.booksapp.booksApp.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding> (val bindingInflater : (inflater : LayoutInflater) -> VB) : Fragment() {

    private var _binding : VB? = null
    protected val binding
        get() = _binding!!

    abstract fun onViewCreatedLight()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bindingInflater(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onViewCreatedLight()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}