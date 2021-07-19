package com.example.usersandposts.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.usersandposts.viewmodels.UsersListFragmentViewModel
import com.example.usersandposts.viewmodels.ViewModelFactory
import com.example.usersandposts.viewmodels.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(UsersListFragmentViewModel::class)
    internal abstract fun UsersListFragmentViewModel(viewModel: UsersListFragmentViewModel): ViewModel

    //Add more ViewModels here
}