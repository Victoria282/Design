package com.example.viewcomponents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewcomponents.adapter.TicketAdapter
import com.example.viewcomponents.databinding.ActivityMainBinding
import com.example.viewcomponents.model.creator.TicketCreator

class MainActivity : AppCompatActivity() {
    private val fakeTickets = TicketCreator.create()
    private val ticketAdapter = TicketAdapter(fakeTickets)

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initRecycler()
    }

    private fun initRecycler() = with(binding) {
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = ticketAdapter
    }
}