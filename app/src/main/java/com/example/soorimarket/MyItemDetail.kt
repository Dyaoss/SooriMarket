package com.example.soorimarket

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.soorimarket.databinding.ActivityMyItemDetailBinding
import java.text.DecimalFormat

class MyItemDetail : AppCompatActivity() {

    private val binding by lazy { ActivityMyItemDetailBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //뒤로가기 버튼
        binding.ivBack.setOnClickListener {
            finish()
        }

        val myItem = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("data", MyItem::class.java)
        } else {
            intent.getParcelableExtra("data")
        } ?: return


        val dec = DecimalFormat("#,###")

        binding.ivDetailMainImage.setImageResource(myItem.aImage)
        binding.tvItemDetailName.text = myItem.aName
        binding.tvDetailId.text = myItem.aSeller
        binding.tvDetailItemPrice.setText("${dec.format(myItem.aPrice)}원")
        binding.tvDetailRegion.text = myItem.aRegion
        binding.tvItemDetailInfo.text = myItem.aInfo


    }
}