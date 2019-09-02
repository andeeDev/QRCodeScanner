package com.ssu.andeeApp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class Adapter : RecyclerView.Adapter<CustomViewHolder>() {


    private val titles:MutableList<String> =  mutableListOf("hello", "world", "mike")
    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val callForRow = layoutInflater.inflate(R.layout.item, parent, false)

        return CustomViewHolder(callForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        //holder.view.time.text =  titles[position]
    }
}

class CustomViewHolder(val view:View): RecyclerView.ViewHolder(view) {

}
