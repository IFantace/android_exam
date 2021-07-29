package com.example.exam.vmodel

import android.service.autofill.UserData
import androidx.lifecycle.ViewModel
import com.example.exam.User
import com.example.exam.model.UserModel

class UserViewModel : ViewModel() {

    private val repository= UserModel()

    fun saveText(avatarUrl: String,login: String,siteAdmin: String,){
        repository.addUser(avatarUrl,
            avatarUrl,
            siteAdmin)
    }
    fun getAll() = repository.getAll()
}