package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.adapter.UserRecyclerAdapter
import com.example.exam.vmodel.UserViewModel
import com.example.exam.vmodel.VMFactory

class MainActivity : AppCompatActivity() {

    private val viewModel: UserViewModel by lazy {
        ViewModelProvider(this, VMFactory()).get(UserViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.saveText("https://github.com/bumptech/glide/raw/master/static/glide_logo.png",
            "https://github.com/bumptech/glide/raw/master/static/glide_logo.png",
            "https://github.com/bumptech/glide/raw/master/static/glide_logo.png");
        viewModel.saveText("https://github.com/bumptech/glide/raw/master/static/glide_logo.png",
            "https://github.com/bumptech/glide/raw/master/static/glide_logo.png",
            "https://github.com/bumptech/glide/raw/master/static/glide_logo.png");
        viewModel.saveText("https://github.com/bumptech/glide/raw/master/static/glide_logo.png",
            "https://github.com/bumptech/glide/raw/master/static/glide_logo.png",
            "https://github.com/bumptech/glide/raw/master/static/glide_logo.png");
        val recyclerView: RecyclerView = findViewById(R.id.mainRecyclerView)
        recyclerView.apply {
            adapter= UserRecyclerAdapter(viewModel)
            layoutManager= LinearLayoutManager(context)
        }
    }
}