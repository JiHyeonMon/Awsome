package com.example.awsome.activity_admin

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.awsome.R

class AdminAdapter (private val context: Context): RecyclerView.Adapter<AdminViewHolder>(){
    var datas  = mutableListOf<AdminData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdminViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_admin, parent, false)
        return AdminViewHolder(view)
    }

    override fun getItemCount(): Int {return datas.size}

    override fun onBindViewHolder(holder: AdminViewHolder, position: Int) {holder.bind(datas[position])}

}