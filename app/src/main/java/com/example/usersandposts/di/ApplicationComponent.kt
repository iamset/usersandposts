package com.example.usersandposts.di

import com.example.usersandposts.di.modules.NetworkModule
import com.example.usersandposts.di.modules.ViewModelModule
import com.example.usersandposts.views.MainActivity
import com.example.usersandposts.views.UsersListFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ViewModelModule::class, NetworkModule::class])
interface ApplicationComponent {

    fun inject(fragment: UsersListFragment)
}