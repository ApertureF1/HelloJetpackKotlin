package com.example.navigation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.navigation.R
import com.example.navigation.db.City

/**
 * Created by jiali on 2019-08-01.
 */
class CityAdapter : PagedListAdapter<City, CityAdapter.CityViewHolder>(diffCallback) {
    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.bindTo(getItem(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): CityViewHolder = CityViewHolder(parent)

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<City>() {
            override fun areItemsTheSame(oldItem: City, newItem: City): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: City, newItem: City): Boolean =
                oldItem == newItem
        }
    }

    class CityViewHolder(parent: ViewGroup) :
        RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.city_item, parent, false)) {
        private val nameView = itemView.findViewById<TextView>(R.id.name)
        private var city: City? = null

        fun bindTo(city: City?) {
            this.city = city
            nameView.text = city?.name
        }
    }
}