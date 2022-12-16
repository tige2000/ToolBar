package com.tige_ral_ramirez.toolbar_puzzle_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val onlyToolBar = findViewById<View>(R.id.myToolbar) as Toolbar

        setSupportActionBar(onlyToolBar)
        getSupportActionBar()?.setDisplayShowTitleEnabled(false)
    }
}