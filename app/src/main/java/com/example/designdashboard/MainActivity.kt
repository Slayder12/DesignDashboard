package com.example.designdashboard


import android.os.Bundle
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import com.example.designdashboard.databinding.ActivityMainBinding
import com.example.designdashboard.models.GridViewAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: GridViewAdapter
    private val items = DataBase().list

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = GridViewAdapter(list = items, this@MainActivity)
        binding.gridViewGV.adapter = adapter


        binding.gridViewGV.onItemClickListener = AdapterView.OnItemClickListener{ _, _, position, _ ->
            //val item = items[position]

        }
    }
}