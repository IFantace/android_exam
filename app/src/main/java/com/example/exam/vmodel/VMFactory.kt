package com.example.exam.vmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class  VMFactory(): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.newInstance()
    }
}