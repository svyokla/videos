package com.example.videos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.videos.adapters.CategoryAdapter
import com.example.videos.fragments.CategoryFragment
import com.example.videos.models.Category

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.container, CategoryFragment())
            .commit()
    }
}