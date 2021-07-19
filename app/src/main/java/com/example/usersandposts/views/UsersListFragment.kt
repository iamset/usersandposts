package com.example.usersandposts.views

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.usersandposts.BaseApplication
import com.example.usersandposts.R
import com.example.usersandposts.adapters.UsersListAdapter
import com.example.usersandposts.di.DaggerApplicationComponent
import com.example.usersandposts.models.User
import com.example.usersandposts.utils.CellClickListener
import com.example.usersandposts.viewmodels.UsersListFragmentViewModel
import com.example.usersandposts.viewmodels.ViewModelFactory
import javax.inject.Inject


class UsersListFragment : Fragment(R.layout.fragment_users_list){
    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory


    val usersListFragmentViewModel : UsersListFragmentViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[UsersListFragmentViewModel::class.java]
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rvUsers:RecyclerView = view.findViewById(R.id.rv_users)


        usersListFragmentViewModel.getUsers()
        usersListFragmentViewModel.response.observe(viewLifecycleOwner, Observer {
            rvUsers.apply {
                adapter = UsersListAdapter(it)
                layoutManager = LinearLayoutManager(context)

            }
        })

    }

    override fun onAttach(context: Context) {
        (context.applicationContext as BaseApplication).appComponent.inject(this)
        super.onAttach(context)

    }


}