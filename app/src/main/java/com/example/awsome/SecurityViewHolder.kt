package com.example.awsome.activity_security

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.awsome.R

class SecurityViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){

    val txt_ListName = itemView.findViewById<TextView>(R.id.txt_ListName)
    val txt_ListInfo = itemView.findViewById<TextView>(R.id.txt_ListInfo)

    fun bind(securityData: SecurityData){
        txt_ListName.text = securityData.txt_ListName
        txt_ListInfo.text = securityData.txt_ListInfo
    }
}