package com.example.adityamadjid.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Muhammad Aditya Madjid - 22.83.0885"
    }
    val text: LiveData<String> = _text
}