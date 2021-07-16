package com.example.usersandposts.api

import com.example.usersandposts.models.User
import retrofit2.Response
import retrofit2.http.GET
import javax.inject.Inject

interface ApiService{
    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}