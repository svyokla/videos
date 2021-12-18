package com.example.videos.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.videos.Categories
import com.example.videos.Constants
import com.example.videos.R


class VideoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_video, container, false)
        var filteredArray = Constants.categories.filter{item ->
            item.id == Categories.Cartoon.ordinal ||
                    item.id == Categories.Comedy.ordinal ||
                    item.id == Categories.Horror.ordinal
        }
        return view
    }

}