package com.example.soorimarket

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.soorimarket.databinding.ItemRecyclerviewBinding

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
        holder.imageView.setOnClickListener{
            itemClick?.onClick(it,position)
        }
        holder.imageView.setImageResource(mItem[position].aImage)
        holder.name.text = mItem[position].aName.toString()
        holder.region.text = mItem[position].aRegion.toString()
        holder.price.text = mItem[position].aPrice.toString()
    }

    override fun getItemId(position: Int):Long{
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return mItem.size
    }

    inner class Holder(val binding: ItemRecyclerviewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val imageView = binding.imageItem
        val name = binding.tvItemName1
        val region = binding.tvItemRegion1
        val price = binding.tvItemPrice1
        val commentNum = binding.tvCommentNum
        val heartNum = binding.tvHeartNum
    }
}