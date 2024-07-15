package com.example.soorimarket

import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.soorimarket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataList = mutableListOf<MyItem>()
        dataList.add(MyItem(R.drawable.sample1,R.string.sample1_name,R.string.sample1_region,1000,R.string.sample1_info))
        dataList.add(MyItem(R.drawable.sample2,R.string.sample2_name,R.string.sample2_region,20000,R.string.sample2_info))
        dataList.add(MyItem(R.drawable.sample3,R.string.sample3_name,R.string.sample3_region,10000,R.string.sample3_info))
        dataList.add(MyItem(R.drawable.sample4,R.string.sample4_name,R.string.sample4_region,10000,R.string.sample4_info))
        dataList.add(MyItem(R.drawable.sample5,R.string.sample5_name,R.string.sample5_region,150000,R.string.sample5_info))
        dataList.add(MyItem(R.drawable.sample6,R.string.sample6_name,R.string.sample6_region,50000,R.string.sample6_info))
        dataList.add(MyItem(R.drawable.sample7,R.string.sample7_name,R.string.sample7_region,150000,R.string.sample7_info))
        dataList.add(MyItem(R.drawable.sample8,R.string.sample8_name,R.string.sample8_region,180000,R.string.sample8_info))
        dataList.add(MyItem(R.drawable.sample9,R.string.sample9_name,R.string.sample9_region,30000,R.string.sample9_info))
        dataList.add(MyItem(R.drawable.sample10,R.string.sample10_name,R.string.sample10_region,190000,R.string.sample10_info))

        val adapter = MyAdapter(dataList)
        binding.recyclerview.adapter = adapter
        binding.recyclerview.layoutManager = LinearLayoutManager(this)

        adapter.itemClick = object : MyAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {
                val name: String = dataList[position].aName.toString()
                Toast.makeText(this@MainActivity,"$name 선택",Toast.LENGTH_SHORT).show()
            }
        }
    }
}