package com.example.viewcomponents.data

data class Ticket(
    val idTicket: Int,
    val departureTime: String,
    val arrivalTime: String,
    val sendingPlace: String,
    val destinationPlace: String,
    val flightNumber: String,
    val flightTime: String,
    val flightDate: String
)