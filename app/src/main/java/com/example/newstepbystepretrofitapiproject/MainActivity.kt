package com.example.newstepbystepretrofitapiproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newstepbystepretrofitapiproject.Adapter.UserAdapter
import com.example.newstepbystepretrofitapiproject.ViewModel.UserViewModel

class MainActivity : AppCompatActivity() {
    private val userViewModel = UserViewModel()
    private  lateinit var recyclerView : RecyclerView
    private lateinit var adapter:UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = UserAdapter()
        recyclerView.adapter = adapter

        userViewModel.users.observe(this) { users ->
            adapter.submitList(users)
        }
        userViewModel.getUsers()
//        recyclerView.setOnClickListener {
//
//            Toast.makeText(this,"This is recycler view",Toast.LENGTH_LONG).show()
//        }
    }

}
