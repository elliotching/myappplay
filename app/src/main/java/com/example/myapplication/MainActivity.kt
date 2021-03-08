package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SimpleAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
import kotlinx.android.synthetic.main.item_simple.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rv: RecyclerView = findViewById(R.id.rv_user_address)

        val a = arrayListOf<String>()
        for(i in 0 until 6){
            a.add(i.toString())
        }
        rv.adapter = AaAdapter(a)
        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }


    class AaAdapter(
            var items: ArrayList<String>
    ) :RecyclerView.Adapter<RecyclerView.ViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            return AaViewHolder(
                        LayoutInflater.from(parent.context)
                                .inflate(R.layout.item_simple, parent, false)
                )
        }

        override fun getItemCount(): Int {
            return (items.size)
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            holder.itemView.text.text = items[position]
        }

        inner class AaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        }

    }
}