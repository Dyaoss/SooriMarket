package com.example.soorimarket

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.soorimarket.databinding.ActivityMainBinding
import com.example.soorimarket.databinding.ActivityMyItemDetailBinding
import kotlinx.parcelize.Parcelize

class MyItemDetail : AppCompatActivity() {

    private val binding by lazy { ActivityMyItemDetailBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //뒤로가기 버튼
        binding.ivBack.setOnClickListener {
            finish()
        }

        var user = intent?.getParcelableArrayListExtra<MyItem>("data")




    }
}