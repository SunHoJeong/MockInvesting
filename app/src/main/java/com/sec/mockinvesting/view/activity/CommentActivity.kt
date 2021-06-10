package com.sec.mockinvesting.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sec.mockinvesting.R
import com.sec.mockinvesting.databinding.CommentActivityLayoutBinding
import com.sec.mockinvesting.view.fragment.CommentFragment

class CommentActivity : AppCompatActivity() {
    private lateinit var binding: CommentActivityLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.comment_activity_layout)

        supportFragmentManager.beginTransaction()
            .add(R.id.comment_fragment_container, CommentFragment()).commit()

        super.onCreate(savedInstanceState)
    }
}