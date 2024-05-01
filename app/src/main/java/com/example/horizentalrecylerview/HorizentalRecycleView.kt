package com.example.horizentalrecylerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.horizentalrecylerview.databinding.ListViewBinding


class HorizentalRecycleView(private val itemList:ArrayList<Data>):RecyclerView.Adapter<HorizentalRecycleView.MyViewHolder>(){
    class MyViewHolder(val binding: ListViewBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ListViewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val menuItem = itemList[position]
        holder.binding.apply {
            imageView.setImageResource(menuItem.image)
            name.text = menuItem.name
        }
    }
}