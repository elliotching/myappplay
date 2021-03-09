package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rv: RecyclerView = findViewById(R.id.rv_user_address)

        val a = arrayListOf<Obbb>()
        for (i in 0 until 2) {
            a.add(Obbb("var A var A var A var A var A $i", "var B var B var B var B $i"))
        }
        rv.adapter = AaAdapter(a)
        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }


    class AaAdapter(
        var items: ArrayList<Obbb>
    ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


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
//            holder.itemView.t1?.text = items[position].varA
//            holder.itemView.t2?.text = items[position].varB
//            if (position == 1) {
//                holder.itemView.ll?.visibility = View.GONE
//            }
        }

        inner class AaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        }

    }

}

data class Obbb(
    val varA: String,
    val varB: String
)