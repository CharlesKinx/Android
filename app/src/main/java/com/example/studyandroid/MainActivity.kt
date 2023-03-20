package com.example.studyandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.studyandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)


        val editText = binding.editTest
        val button = binding.buttonTest

        setContentView(binding.root)
        button.setOnClickListener {
            val message = editText.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
        }

    }
}