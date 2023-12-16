package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    private val text: TextView
        get() = findViewById(R.id.Txt)

    private val button: TextView
        get() = findViewById(R.id.Btn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        mainViewModel.firstLiveData.observe(this, Observer {
            text.text = it
        })

        button.setOnClickListener{
            mainViewModel.updateLiveData()
        }
    }
}