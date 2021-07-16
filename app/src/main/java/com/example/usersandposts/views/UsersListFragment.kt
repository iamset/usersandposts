package com.example.usersandposts.views

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.usersandposts.BaseApplication
import com.example.usersandposts.R
import com.example.usersandposts.di.DaggerApplicationComponent
import com.example.usersandposts.viewmodels.UsersListFragmentViewModel
import com.example.usersandposts.viewmodels.ViewModelFactory
import javax.inject.Inject


class UsersListFragment : Fragment(R.layout.fragment_users_list){

    @Inject lateinit var usersListFragmentViewModel : UsersListFragmentViewModel
    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //use viewmodel here.
        usersListFragmentViewModel = ViewModelProvider(this, viewModelFactory)[UsersListFragmentViewModel::class.java]
        usersListFragmentViewModel.getUsers()
        usersListFragmentViewModel.response.observe(viewLifecycleOwner, Observer {

        })

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

//        (context as BaseApplication).appComponent.inject(this)
    }

}