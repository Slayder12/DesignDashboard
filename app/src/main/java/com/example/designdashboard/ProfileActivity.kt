package com.example.designdashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.designdashboard.databinding.ActivityProfileBinding


class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageDataCardTV.setImageResource(R.drawable.photo)
        binding.firstNameTV.text = "Андрей"
        binding.lastNameTV.text = "Кузнецов"
        binding.DateTV.text = "12.05.1989г"
        binding.phoneNumberTV.text = "+78088761239"

    }
}