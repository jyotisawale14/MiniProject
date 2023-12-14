package com.smartCityApplication;

import java.util.ArrayList;
import java.util.List;

class SmartCityGuide {
    List<Hotel> hotels;
    List<AirTicketBooking> airTicketBookings;
    List<CityNews> cityNews;
    List<MathCalculator> MathCalculator;

    public SmartCityGuide() {
        hotels = new ArrayList<>();
        airTicketBookings = new ArrayList<>();
        cityNews = new ArrayList<>();
        MathCalculator=new ArrayList<>();
    }

    void displayHotelInformation() {
        System.out.println("************************ Hotel Information ****************************");
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }

   
    void displayAirTicketBookingInformation() {
        System.out.println("************************  Air Ticket Booking Information ************************ ");
        for (AirTicketBooking booking : airTicketBookings) {
            System.out.println(booking);
        }
    }

    void displayCityNews() {
        System.out.println("************************  City News ************************ ");
        for (CityNews news : cityNews) {
            System.out.println(news);
        }
    }
    
    void displayMathCalculator() {
        System.out.println("************************  Calculate Expenses ************************ ");
        for (MathCalculator calculator : MathCalculator) {
            System.out.println(calculator);
        }
    }
}

