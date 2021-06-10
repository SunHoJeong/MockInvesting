package com.sec.mockinvesting.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.sec.mockinvesting.R
import com.sec.mockinvesting.databinding.CommentFragmentLayoutBinding

class CommentFragment : Fragment() {
    private lateinit var binding: CommentFragmentLayoutBinding
    private lateinit var adapter: CommentAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.comment_fragment_layout, container, false)
        val root: View = binding.getRoot()
        binding.commentList.adapter = adapter
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}