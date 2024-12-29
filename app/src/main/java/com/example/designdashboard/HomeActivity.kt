package com.example.designdashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.designdashboard.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.HomeTV.text = "Home"

    }
}