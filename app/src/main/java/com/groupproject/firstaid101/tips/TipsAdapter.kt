package com.groupproject.firstaid101.tips

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.groupproject.firstaid101.databinding.ItemTipBinding

class TipsAdapter : ListAdapter<Tip, TipsAdapter.TipsViewHolder>(DiffCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipsViewHolder {
        val binding =
            ItemTipBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TipsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TipsViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    inner class TipsViewHolder(private val binding : ItemTipBinding):
        RecyclerView.ViewHolder(binding.root){
            fun bind(tip: Tip){
                binding.apply {
                    tipName.text = tip.name
                    tipContext.text = tip.tip
                }
            }
        }


    class DiffCallBack : DiffUtil.ItemCallback<Tip>() {
        override fun areItemsTheSame(oldItem: Tip, newItem: Tip): Boolean {
            return oldItem.name === newItem.name
        }

        override fun areContentsTheSame(oldItem: Tip, newItem: Tip): Boolean {
            return oldItem.tip == newItem.tip
        }

    }

}
