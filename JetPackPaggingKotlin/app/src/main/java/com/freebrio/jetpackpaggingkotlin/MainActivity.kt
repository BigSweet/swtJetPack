package com.freebrio.jetpackpaggingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = findViewById<RecyclerView>(R.id.rv)
        val adapter = RecyclerPageAdapter()

        var model = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(StudentViewModel::class.java)
        model.liveData.observe(this, Observer {
            adapter.submitList(it)
        })
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = adapter
    }
}