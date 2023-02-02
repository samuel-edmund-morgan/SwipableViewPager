package com.example.swipableviewpager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.swipableviewpager.databinding.ViewPagerViewHolderBinding

class PagerAdapter(val images: List<Int>) : RecyclerView.Adapter<PagerAdapter.PagerViewHolder>() {
    inner class PagerViewHolder(val binding: ViewPagerViewHolderBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        val binding = ViewPagerViewHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PagerViewHolder(binding)
    }
    override fun getItemCount(): Int  = images.size
    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.binding.ivHolder.setImageResource(images[position])
    }


}