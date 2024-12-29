package com.example.designdashboard


import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.designdashboard.databinding.ActivityMainBinding
import com.example.designdashboard.models.CustomAdapter
import com.example.designdashboard.models.Item

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: CustomAdapter
    private val items = DataBase().list

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = CustomAdapter(items)

        val layoutManager = GridLayoutManager(this, 2)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter


        adapter.setOnItemClickListener(object : CustomAdapter.OnItemClickListener {
            override fun onItemClick(item: Item, position: Int) {
                val intent = when (item.name) {
                    "Home" -> Intent(this@MainActivity, HomeActivity::class.java)
                    "Profile" -> Intent(this@MainActivity, ProfileActivity::class.java)
                    "Settings" -> Intent(this@MainActivity, SettingsActivity::class.java)
                    "Logout" -> Intent(this@MainActivity, LogoutActivity::class.java)

                    else -> null
                }
                Toast.makeText(
                    applicationContext,
                    "Переход в ${item.name}", Toast.LENGTH_SHORT
                ).show()
                intent?.let { startActivity(it) }
            }
        })
    }

}