package com.sujith.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }
}

class MyViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    val tv = view.findViewById<TextView>(R.id.tv)
}