package com.example.horizentalrecylerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.horizentalrecylerview.databinding.ActivityMainBinding
import com.example.horizentalrecylerview.databinding.ListViewBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL, false)
        val listofItem = ArrayList<Data>()

        listofItem.add(Data(R.drawable.coding, "Bangla"))
        listofItem.add(Data(R.drawable.coding, "English"))
        listofItem.add(Data(R.drawable.coding, "Math"))
        listofItem.add(Data(R.drawable.coding, "General Science"))
        listofItem.add(Data(R.drawable.coding, "Regligion"))
        listofItem.add(Data(R.drawable.coding, "Political Science"))

        var myList = HorizentalRecycleView(listofItem)
        binding.recyclerView.adapter = myList


    }
}