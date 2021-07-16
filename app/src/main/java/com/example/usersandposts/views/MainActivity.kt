package com.example.usersandposts.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.usersandposts.BaseApplication
import com.example.usersandposts.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as BaseApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}