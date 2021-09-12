package com.example.viewcomponents.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewcomponents.data.Ticket
import com.example.viewcomponents.R
import com.example.viewcomponents.databinding.KtestBinding

class TicketAdapter(
    private val tickets: List<Ticket>
) : RecyclerView.Adapter<TicketAdapter.TicketViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TicketViewHolder {
        val binding = KtestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TicketViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TicketViewHolder, position: Int) {
        holder.bind(tickets[position])
    }

    override fun getItemCount() = tickets.size

    inner class TicketViewHolder(val binding: KtestBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(ticket: Ticket) {
            with(binding) {
                flightNumber.text = ticket.flightNumber
                tvDepartureTime.text = ticket.departureTime
                tvArrivalTime.text = ticket.arrivalTime
                tvSendingPlace.text = ticket.sendingPlace
                tvDestinationPlace.text = ticket.destinationPlace
                tvFlightTime.text = ticket.flightTime
                tvDateFlight.text = ticket.flightDate
            }
        }
    }
}