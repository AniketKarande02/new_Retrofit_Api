package com.example.newstepbystepretrofitapiproject.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newstepbystepretrofitapiproject.Api.User
import com.example.newstepbystepretrofitapiproject.Repository.UserRepository

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class UserViewModel : ViewModel() {
    private val userRepository = UserRepository()

    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> = _users

    fun getUsers() {
        viewModelScope.launch {
            _users.value = userRepository.getUsers()
        }
    }
}
