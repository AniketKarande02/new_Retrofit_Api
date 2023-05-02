package com.example.newstepbystepretrofitapiproject.Adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newstepbystepretrofitapiproject.Api.User
import com.example.newstepbystepretrofitapiproject.R

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var nameTextView: TextView = itemView.findViewById(R.id.textViewUserName)
    private var emailTextView: TextView = itemView.findViewById(R.id.textViewUserEmail)



    fun bind(user: User) {
        nameTextView.text = user.username
        emailTextView.text = user.email
    }



}
