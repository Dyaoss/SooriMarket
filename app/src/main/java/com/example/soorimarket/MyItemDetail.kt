package com.example.soorimarket

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.soorimarket.databinding.ActivityMainBinding
import com.example.soorimarket.databinding.ActivityMyItemDetailBinding

class MyItemDetail : AppCompatActivity() {

    private val binding by lazy { ActivityMyItemDetailBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}