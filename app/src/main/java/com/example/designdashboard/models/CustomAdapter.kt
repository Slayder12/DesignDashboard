package com.example.designdashboard.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.designdashboard.R

class CustomAdapter(
    private val list: List<Item>,
) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    private var onItemClickListener: OnItemClickListener? = null

    interface OnItemClickListener {
        fun onItemClick(item: Item, position: Int)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageViewIV: ImageView = view.findViewById(R.id.imageViewIV)
        val textViewTV: TextView = view.findViewById(R.id.textViewTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.gridview_item, parent, false)
        return ViewHolder(view)
        }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.imageViewIV.setImageResource(item.image)
        holder.textViewTV.text = item.name

        holder.itemView.setOnClickListener{
            if (onItemClickListener != null){
                onItemClickListener!!.onItemClick(item, position)
            }
        }
    }

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener){
        this.onItemClickListener = onItemClickListener
    }

}


