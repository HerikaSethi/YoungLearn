package com.herika.younglearn.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.herika.younglearn.R
import com.herika.younglearn.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var databinding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        observeDogBreeds()

    }

    private fun observeDogBreeds() {
        viewModel.dogBreeds.observe(this) {
            val dogsList = findViewById<RecyclerView>(R.id.dogs_list)
            dogsList.layoutManager = LinearLayoutManager(this)
            dogsList.adapter = DogsAdapter(it)
        }
    }
}
