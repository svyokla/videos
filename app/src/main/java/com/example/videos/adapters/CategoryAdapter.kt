package com.example.videos.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.videos.R
import com.example.videos.fragments.VideoFragment
import com.example.videos.models.Category


class CategoryAdapter(private val array: ArrayList<Category>, private val context: FragmentActivity): RecyclerView.Adapter<CategoryAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.cell_of_categories, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = array[position]
        holder.textView.text = holder.itemView.context.getString(item.name)
        holder.itemView.setOnClickListener{
            val bundle = Bundle()//intent для фрагментов
            bundle.putInt("category", item.id)
            context.supportFragmentManager.beginTransaction()//переход
                .replace(R.id.container, VideoFragment::class.java, bundle)
                .addToBackStack(null)
                .commit()
        }
    }

    override fun getItemCount(): Int {
        return array.size
    }
}


