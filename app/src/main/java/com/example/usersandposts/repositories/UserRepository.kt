package com.example.usersandposts.repositories

import com.example.usersandposts.api.ApiService
import com.example.usersandposts.models.User
import retrofit2.Response
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val apiService: ApiService
)  {
    suspend fun getUsers(): Response<List<User>>{
        return apiService.getUsers()
    }

}