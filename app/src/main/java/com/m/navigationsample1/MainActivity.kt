package com.m.navigationsample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpListeners()
    }

    private fun setUpListeners() {
        Navigation.createNavigateOnClickListener(R.id.nav_fragment_one)
    }
}
