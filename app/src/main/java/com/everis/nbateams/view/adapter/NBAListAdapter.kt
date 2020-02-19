package com.everis.nbateams.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.everis.nbateams.R
import kotlinx.android.synthetic.main.item.view.*


/*class ListAdapter: RecyclerView.Adapter<ListAdapter.ItemViewHolder>() {

    var list: List<TeamModel> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
        fun bind(list: TeamModel) = with(itemView) {

            // imagen
            tvNickname.text = list.name
            tvStandard.text = list.name

        }
    }

    class ListElementsCallback : DiffUtil.ItemCallback<TeamModel>() {
        override fun areItemsTheSame(oldItem: TeamModel, newItem: TeamModel): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: TeamModel, newItem: TeamModel): Boolean {
            return oldItem.name == newItem.name
        }
    }
}*/
