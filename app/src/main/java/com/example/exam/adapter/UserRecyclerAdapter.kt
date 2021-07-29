package com.example.exam.adapter

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.AsyncTask
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.exam.R
import com.example.exam.vmodel.UserViewModel
import java.io.InputStream
import java.net.URL


class UserRecyclerAdapter(
    private val viewModel: UserViewModel
): RecyclerView.Adapter<UserRecyclerAdapter.ResultViewHolder>() {
    class ResultViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textViewName: TextView = itemView.findViewById(R.id.textViewName)
        val imageViewAvatar: ImageView= itemView.findViewById(R.id.imageViewAvatar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        return ResultViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false))
    }

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
        Log.d("DEBUG", "onBindViewHolder: $position")
        holder.textViewName.text= viewModel.getAll()[position].login.toString()
//        holder.imageViewAvatar = viewModel.getAll()[position].avatarUrl.toString()
        loadImageWithUri(holder.imageViewAvatar,viewModel.getAll()[position].avatarUrl.toString())
    }

    override fun getItemCount(): Int = viewModel.getAll().size


    fun loadImageWithUri(imageView: ImageView, imageUri: String){
        Glide.with(imageView.context).load(Uri.parse(imageUri)).into(imageView)
    }
}