package com.example.usersandposts.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.usersandposts.BaseApplication
import com.example.usersandposts.R
import com.example.usersandposts.di.ApplicationComponent
import com.example.usersandposts.di.DaggerApplicationComponent

class MainActivity : AppCompatActivity() {
    private lateinit var appComponent: ApplicationComponent
    override fun onCreate(savedInstanceState: Bundle?) {

        appComponent = DaggerApplicationComponent.create()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun appComp() = appComponent
}