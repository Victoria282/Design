package com.example.viewcomponents.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewcomponents.Model.Model
import com.example.viewcomponents.R
import com.example.viewcomponents.data.Tickets

class Adapter(private val tickets: List<Model>) : RecyclerView.Adapter<Adapter.MyViewHolder>(){

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var flightNumber: TextView? = null
        var tv_departureTime: TextView? = null
        var tv_arrivalTime: TextView? = null
        var tv_sendingPlace: TextView? = null
        var tv_destinationPlace: TextView? = null
        var tv_flightTime: TextView? = null
        var tv_dateFlight: TextView? = null

        init {
            flightNumber = itemView.findViewById(R.id.flightNumber)
            tv_departureTime = itemView.findViewById(R.id.tv_departureTime)
            tv_arrivalTime = itemView.findViewById(R.id.tv_arrivalTime)
            tv_sendingPlace = itemView.findViewById(R.id.tv_sendingPlace)
            tv_destinationPlace = itemView.findViewById(R.id.tv_destinationPlace)
            tv_flightTime = itemView.findViewById(R.id.tv_flightTime)
            tv_dateFlight = itemView.findViewById(R.id.tv_dateFlight)
        }
    }
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.ktest, parent, false)
        return MyViewHolder(itemView)
    }

     override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.flightNumber?.text = "A78KJ0"
         holder.tv_flightTime?.text = "4:00"
         holder.tv_dateFlight?.text = "12 Sep"
         holder.tv_sendingPlace?.text = "Chelyabinsk"
         holder.tv_destinationPlace?.text = "Moscow"
        holder.tv_departureTime?.text = "15:00"
        holder.tv_arrivalTime?.text = "18:00"
    }
     override fun getItemCount() = tickets.size
}