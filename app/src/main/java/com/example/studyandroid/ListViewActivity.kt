package com.example.studyandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.studyandroid.databinding.ActivityListViewBinding

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityListViewBinding.inflate(layoutInflater)
        var listView = binding.listView

        val fruits = arrayOf("Apple", "Banana", "Orange")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, fruits)
        listView.adapter = adapter


        listView.setOnItemClickListener { adapterView, view, i, l ->
            val selectedItem = fruits[i]
            Toast.makeText(this,selectedItem,Toast.LENGTH_SHORT).show()
        }
        setContentView(binding.root)
    }
}