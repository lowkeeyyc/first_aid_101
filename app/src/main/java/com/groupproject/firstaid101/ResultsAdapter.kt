package com.groupproject.firstaid101

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.groupproject.firstaid101.databinding.ItemProcedureBinding

class ResultsAdapter(private val listener:OnItemCLickListener) :
    ListAdapter<Procedure, ResultsAdapter.ResultsViewHolder>(DiffCallBack()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultsViewHolder {
        val binding =
            ItemProcedureBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ResultsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ResultsViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    inner class ResultsViewHolder(private val binding: ItemProcedureBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(procedure: Procedure) {
            binding.apply {
                procedureName.text = procedure.name
                procedureSteps.text = procedure.steps

                root.setOnClickListener{
                    val position = adapterPosition
                    if (position!=RecyclerView.NO_POSITION){
                        listener.onItemClick(position)
                    }
                }
            }
        }

    }

    class DiffCallBack : DiffUtil.ItemCallback<Procedure>() {
        override fun areItemsTheSame(oldItem: Procedure, newItem: Procedure): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Procedure, newItem: Procedure): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }


    }
    interface OnItemCLickListener{
        fun onItemClick(position: Int)
    }

}