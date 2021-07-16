package com.example.usersandposts

import android.app.Application
import com.example.usersandposts.di.DaggerApplicationComponent

class BaseApplication : Application() {

    val appComponent = DaggerApplicationComponent.create()
}