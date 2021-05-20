package com.sec.mockinvesting.view.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sec.mockinvesting.R
import com.sec.mockinvesting.databinding.CommentActivityLayoutBinding
import com.sec.mockinvesting.view.fragment.CommentFragment

class CommentActivity : AppCompatActivity() {
    private lateinit var binding: CommentActivityLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.comment_activity_layout)

        supportFragmentManager.beginTransaction()
            .add(R.id.comment_fragment_container, CommentFragment()).commit()

        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onResume() {
        Log.i("CommentActivity", "It's not easy")
        super.onResume()
    }
}