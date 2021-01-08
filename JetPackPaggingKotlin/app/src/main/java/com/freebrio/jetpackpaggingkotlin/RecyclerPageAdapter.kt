package com.freebrio.jetpackpaggingkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 1/7/21
 */

var diffUtil: DiffUtil.ItemCallback<Student> = object : DiffUtil.ItemCallback<Student>() {
    override fun areItemsTheSame(oldItem: Student, newItem: Student): Boolean {
        return oldItem.age == newItem.age
    }

    override fun areContentsTheSame(oldItem: Student, newItem: Student): Boolean {
        return oldItem.equals(newItem)
    }

}

class RecyclerPageAdapter() : PagedListAdapter<Student, RecyclerPageAdapter.Holder>(diffUtil) {

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(name: String?) {
            itemView.findViewById<TextView>(R.id.name).text = name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.item, null))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(getItem(position)?.name)
    }
}