package com.smartCityApplication;

import java.util.*;

class Hotel {
    String name;
    String address;
    double rating;

    public Hotel(String name, String address, double rating) {
        this.name = name;
        this.address = address;
        this.rating = rating;
    }

    public String toString() {
        return "Hotel: " + name + "\nAddress: " + address + "\nRating: " + rating + "\n";
    }
}
