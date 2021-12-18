package com.example.videos.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.videos.Constants
import com.example.videos.R
import com.example.videos.adapters.CategoryAdapter

class CategoryFragment : Fragment(){
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_category, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.adapter = CategoryAdapter(Constants.categories, requireActivity())
        activity
        return view
    }
}