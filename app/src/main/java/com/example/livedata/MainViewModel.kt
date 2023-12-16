package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val firstPrivateLiveData = MutableLiveData<String>("Hello Bro")

    val firstLiveData: LiveData<String>
        get() = firstPrivateLiveData

    fun updateLiveData() {
        firstPrivateLiveData.value = "hello czn"
    }
}