package com.neoteric.tsrtcbusbooking;

import java.util.List;

public class test {
    public static void main(String[] args) {
        TravelDBService travelDBService = new TravelDBService();
        String from = "HYD";
        String to = "VIZ";

        List<Bus> availableBuses = travelDBService.findBuses(from, to);

        if (availableBuses.isEmpty()) {
            System.out.println("No buses available from " + from + " to " + to);
        } else {
            System.out.println("Available buses from " + from + " to " + to + ":");
            for (Bus bus : availableBuses) {
                System.out.println(bus);

            }
        }
    }

}



