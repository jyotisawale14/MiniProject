package com.smartCityApplication;

class AirTicketBooking {
    String airline;
    String destination;
    double price;

    public AirTicketBooking(String airline, String destination, double price) {
        this.airline = airline;
        this.destination = destination;
        this.price = price;
    }

    public String toString() {
        return "Airline: " + airline + "\nDestination: " + destination + "\nPrice: $" + price + "\n";
    }
}

