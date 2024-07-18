package com.example.soorimarket

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.soorimarket.databinding.ItemRecyclerviewBinding
import java.text.DecimalFormat

class MyAdapter(val mItem: MutableList<MyItem>) : RecyclerView.Adapter<MyAdapter.Holder>() {

    interface ItemClick {
        fun onClick(view: View, position: Int)
    }

    var itemClick: ItemClick? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding =
            ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.contents.setOnClickListener {
            itemClick?.onClick(it, position)
        }
        val dec = DecimalFormat("#,###")
        holder.imageView.setImageResource(mItem[position].aImage)
        holder.name.text = mItem[position].aName
        holder.region.text = mItem[position].aRegion
        holder.price.setText("${dec.format(mItem[position].aPrice)}원")
        holder.commentNum.text = mItem[position].chat.toString()
        holder.heartNum.text = mItem[position].heart.toString()
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return mItem.size
    }

    inner class Holder(val binding: ItemRecyclerviewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val imageView = binding.imageItem
        val contents = binding.layoutContents
        val name = binding.tvItemName
        val region = binding.tvItemRegion
        val price = binding.tvItemPrice
        val commentNum = binding.chatNum
        val heartNum = binding.heartNum
    }


}