package com.example.cooking_recipes_project.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cooking_recipes_project.R

class RecycleViewItemPageAdapter(val items: Array<String>,val context: Context)  : RecyclerView.Adapter<RecycleViewItemPageAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewItemPageAdapter.ViewHolder {
      return ViewHolder(
          LayoutInflater.from(context).inflate(R.layout.fragment_sub_item, parent, false)
      )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
       return items.size
    }
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){

    }


}
