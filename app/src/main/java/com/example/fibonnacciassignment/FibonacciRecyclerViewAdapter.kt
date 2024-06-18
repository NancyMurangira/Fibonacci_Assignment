package com.example.fibonnacciassignment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
class FibonacciRecyclerViewAdapter (var numbers:List<Int>): RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val numberView = LayoutInflater.from(parent.context)
            .inflate(R.layout.nums_list_item, parent, false)
        return NumbersViewHolder(numberView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvText.text=numbers[position].toString()
    }



    override fun getItemCount(): Int {
        return numbers.size
    }
}
    class NumbersViewHolder(numberView:View) : RecyclerView.ViewHolder(numberView) {
        val tvText = numberView.findViewById<TextView>(R.id.tvText)

    }
