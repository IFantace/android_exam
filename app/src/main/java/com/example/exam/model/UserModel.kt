package com.example.exam.model

import com.example.exam.User

class UserModel {
    companion object{
        private var data= ArrayList<User>()
    }

    fun addUser(avatarUrl: String,login: String,siteAdmin: String,){
        data.add(User(avatarUrl,login,siteAdmin))
    }

    fun getAll() = data
}