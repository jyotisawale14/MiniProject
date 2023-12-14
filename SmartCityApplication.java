package com.smartCityApplication;

import java.util.*;
import java.util.Scanner;


public class SmartCityApplication {
    public static void main(String[] args) {
    	
        SmartCityGuide cityGuide = new SmartCityGuide();

        cityGuide.hotels.add(new Hotel("Spice Haven Retreat", "22 Saffron Street, Jaipur, Rajasthan 302001, India", 4.5));
        cityGuide.hotels.add(new Hotel("Royal Curry Suites", "14 Masala Avenue, Mumbai, Maharashtra 400001, India", 4.8));
        cityGuide.hotels.add(new Hotel("Mysore Majesty Hotel", "7 Ganges View Road, Varanasi, Uttar Pradesh 221001, India", 4.0));
        cityGuide.hotels.add(new Hotel("Ganges Grace Hotel", "45 Curry Lane, Bangalore, Karnataka 560001, India", 3.8));
        cityGuide.hotels.add(new Hotel("Bollywood Bliss Boutique Hotel", "18 Taj Mahal Crescent, Agra, Uttar Pradesh 282001, India", 3.5));
        cityGuide.hotels.add(new Hotel("Karma Kuisine Resort", "Coconut Grove Lane, Goa, Goa 403001, India", 4.2));
        cityGuide.hotels.add(new Hotel("Ayurveda Oasis Resort", "Himalaya Heights, Shimla, Himachal Pradesh 171001, India", 4.8));
       
        cityGuide.airTicketBookings.add(new AirTicketBooking("AeroDestiny Flights", "Mumbai, Mahrashtra , India", 350.0));
        cityGuide.airTicketBookings.add(new AirTicketBooking("VistaJet Airways", "jaipur, Rajasthan, India", 450.0));
        cityGuide.airTicketBookings.add(new AirTicketBooking("CelestialSky Airways", "Bangalore, Karnatak,India", 400.0));
        cityGuide.airTicketBookings.add(new AirTicketBooking("BeyondHorizon Airlines", "Goa, Goa, India", 550.0));
        cityGuide.airTicketBookings.add(new AirTicketBooking("VistaJet Airways", "Shimla, Himachal pradesh", 300.0));
        cityGuide.airTicketBookings.add(new AirTicketBooking("NimbusWings Airlines", "Varanasi ,Utter Pradesh", 430.0));
        
        cityGuide.cityNews.add(new CityNews("City Celebrates Annual Festival", "Thousands gathered for the annual festival...",
                new Date()));
        cityGuide.cityNews.add(new CityNews("New City Infrastructure Project", "City announces plans for a new...",
                new Date()));
        cityGuide.cityNews.add(new CityNews("Breakthrough in Renewable Energy: Solar-Powered Cars Hit the Streets", "Tech Giants Join Forces for Sustainable E-Waste Management Initiative...",
                new Date()));
        cityGuide.cityNews.add(new CityNews("Revolutionizing Transportation:", "Flying Taxis Approved for Urban Mobility...",
                new Date()));
        cityGuide.cityNews.add(new CityNews("Space Exploration Milestone:", "First Human Settlers on Mars by 2030...",
                new Date()));
        
        MathCalculator calculator1 = new MathCalculator();

        double hotelCost1 = 150.0;
        double airTicketCost1 = 200.0;

        // Calculate total expense
        double totalExpense1 = calculator1.add(hotelCost1, airTicketCost1);
        System.out.println("Total Expense: " + totalExpense1);

        // Display welcome message
        System.out.println("Welcome to the Smart City Guide!");
       

        // Main menu
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Hotel Information");
            System.out.println("2. Air Ticket Booking Information");
            System.out.println("3. City News");
            System.out.println("4. Calculate Expenses");
            System.out.println("5. Exit");

            // Take user input
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cityGuide.displayHotelInformation();
                    break;
                case 2:
                    cityGuide.displayAirTicketBookingInformation();
                    break;
                case 3:
                    cityGuide.displayCityNews();
                    break;
                case 4:
                    cityGuide.displayMathCalculator();
                    break;

                case 5:
                    System.out.println("Exiting the Smart City Guide. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
