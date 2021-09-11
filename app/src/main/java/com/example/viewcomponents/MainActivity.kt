package com.example.viewcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewcomponents.Adapter.Adapter
import com.example.viewcomponents.Model.Model
import com.example.viewcomponents.data.Tickets

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // инициализация recycler
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(fillList())

       /*
        ТЕСТИМ:
        // Вывод один -> com.example.viewcomponents.Model.Model@8a07693
        println(Tickets[0].destinationPlace)
        println(Tickets[0])
        println(Tickets.first())
        println((Tickets.component5()))
        println(Tickets)*/
    }


    // НЕ работает.. ?!
    // Отправка списка билетов
    private fun fillList():List<Model> {
        return Tickets
    }
}