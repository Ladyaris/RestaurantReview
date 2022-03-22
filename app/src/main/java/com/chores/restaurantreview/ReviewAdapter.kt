package com.chores.restaurantreview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReviewAdapter(private val listReview: List<String>) :
    RecyclerView.Adapter<ReviewAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvItem: TextView = view.findViewById(R.id.tvItem)
    }

    override fun onBindViewHolder(viewholder: ViewHolder, position: Int) {
        viewholder.tvItem.text = listReview[position]
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int) = ViewHolder (
        LayoutInflater.from(viewGroup.context).inflate(R.layout.item_review, viewGroup, false)
    )

    override fun getItemCount() = listReview.size

}