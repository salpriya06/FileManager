package com.example.filemanager

import android.graphics.Color
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FileManagerAdapter(private val itemAd: ArrayList<FileItem>) :
        RecyclerView.Adapter<FileManagerAdapter.ViewHolder>(){

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemName: TextView = itemView.findViewById(R.id.itemName)
        val itemIcon: ImageView = itemView.findViewById(R.id.itemIcon)
    }

    override fun getItemCount() = itemAd.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.item, null)


        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemm = itemAd[position]

        holder.itemName.text = itemm.name
        holder.itemIcon.setImageResource(itemm.image)

//        if (itemm.) {
//            holder.itemView.setBackgroundColor(Color.GRAY)
//        } else {
//            holder.itemView.setBackgroundColor(Color.WHITE)
//        }
    }

}