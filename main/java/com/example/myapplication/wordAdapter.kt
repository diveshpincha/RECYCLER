package com.example.myapplication

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class wordAdapter:RecyclerView.Adapter<wordAdapter.TextItemViewHolder>() {
    var data = listOf<String>()
    set(value) {
        field=value
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int{
        return data.size
    }

    override fun onBindViewHolder(holder: TextItemViewHolder, position: Int) {
        var item=data[position]
        if(item=="best"){
            item = "shinchan is best"
            holder.textView.setTextColor(Color.MAGENTA)
        }
        else{
            holder.textView.setTextColor(Color.BLACK)

        }
            holder.textView.text=item

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextItemViewHolder {
        val layoutInflater = LayoutInflater.from((parent.context))
        val view=layoutInflater.inflate(R.layout.word_textview,parent,false) as TextView
        return TextItemViewHolder(view)
    }

    class TextItemViewHolder(val textView: TextView): RecyclerView.ViewHolder(textView)

}
