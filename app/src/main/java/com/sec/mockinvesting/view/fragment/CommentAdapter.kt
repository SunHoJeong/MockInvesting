package com.sec.mockinvesting.view.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.mockinvesting.databinding.CommentItemBinding

class CommentAdapter(private val dataSet: Array<String>) :
    RecyclerView.Adapter<CommentAdapter.CommentViewHolder>() {

    var items = ArrayList<String>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        val binding = CommentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CommentViewHolder(binding)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class CommentViewHolder(val binding: CommentItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(string: String) {
            binding.itemText.setText(string)
        }
    }
}