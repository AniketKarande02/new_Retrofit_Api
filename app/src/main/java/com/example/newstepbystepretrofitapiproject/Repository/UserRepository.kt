package com.example.newstepbystepretrofitapiproject.Repository

import com.example.newstepbystepretrofitapiproject.Api.ApiService
import com.example.newstepbystepretrofitapiproject.Api.RetrofitInstance.retrofit
import com.example.newstepbystepretrofitapiproject.Api.User

class UserRepository {
    private val apiService = retrofit.create(ApiService::class.java)

    suspend fun getUsers(): List<User> {
        return apiService.getUsers()

    }
}
