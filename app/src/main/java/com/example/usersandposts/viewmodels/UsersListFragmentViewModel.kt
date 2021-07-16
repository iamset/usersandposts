package com.example.usersandposts.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.usersandposts.models.User
import com.example.usersandposts.repositories.UserRepository
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

class UsersListFragmentViewModel @Inject constructor (
    private val repository: UserRepository
        ): ViewModel() {

    val response:MutableLiveData<List<User>> = MutableLiveData()
    fun getUsers(){
        viewModelScope.launch {
            val result = repository.getUsers()
            if(result.isSuccessful){
                Log.d("usesList", result.body().toString())
                response.value = result.body()
            } else {
                Log.d("usesList", result.errorBody().toString())
            }
        }
    }


}