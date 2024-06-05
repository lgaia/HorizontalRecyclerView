package com.example.apprecyclerview

import Adapter.UserAdapter
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apprecyclerview.databinding.ActivityMainBinding
import com.example.apprecyclerview.ui.theme.AppRecyclerViewTheme
import data.UserRepository

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycler()
    }
    fun initRecycler(){
        binding.rvUsers.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        binding.rvUsers.adapter = UserAdapter(UserRepository.listUsers)
    }
}

