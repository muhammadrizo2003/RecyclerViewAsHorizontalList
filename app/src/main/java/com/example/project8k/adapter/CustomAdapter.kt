package com.example.project8k.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project8k.R
import com.example.project8k.model.Member
import kotlinx.android.synthetic.main.item_custom_layout.view.*

// this is simple recycler view adapter
// recycler view as horizontal list
data class CustomAdapter(private val context: Context, private val members: ArrayList<Member>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CustomViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_custom_layout, parent, false)
        )
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members[position]

        if (holder is CustomViewHolder) {
            holder.textView.text = member.name
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }

    private data class CustomViewHolder(
        val itemView: View,
        val textView: TextView = itemView.text_view_title
    ) : RecyclerView.ViewHolder(itemView)
}
