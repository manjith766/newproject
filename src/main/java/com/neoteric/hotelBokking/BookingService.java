package com.neoteric.hotelBokking;

import java.util.*;

public class BookingService {
    Map<String,HotelBooking>bookings = new HashMap<>();
    private final List<HotelBooking> availableRooms = Arrays.asList(
            new HotelBooking("H1", "Hotel Grand", new Location("viz", "viz", "viz", "10001"), new Room("Deluxe", 101, 200.0), 2, 2),
            new HotelBooking("H2", "Sea View Resort", new Location("hyd", "hyd", "hitechcity", "33101"), new Room("Suite", 202, 250.0), 2, 2),
            new HotelBooking("H3","sitara",new Location("hyd","hyd","kphp","233434"),new Room("suite",22,2000.0),2,1)
    );

    public void displayHotels() {
        System.out.println("Available Rooms:");
        for (HotelBooking hotel : availableRooms) {
            System.out.println(hotel.getBookingId() + " - " + hotel.getHotelName() + " in " + hotel.hotelLocation + " - " + hotel.room);
        }
    }

    public String bookRoom(String hotelName, int roomNo, int adults, int children) {
        for (HotelBooking hotel : availableRooms) {
            if (hotel.getHotelName().equalsIgnoreCase(hotelName) && hotel.room.roomNo == roomNo) {
                String bookingId = UUID.randomUUID().toString();
                HotelBooking booking = new HotelBooking(bookingId, hotelName, hotel.hotelLocation, hotel.room, adults, children);
                bookings.put(bookingId, booking);
                return bookingId;
            }
        }
        System.out.println("Invalid room selection.");
        return null;
    }

    public boolean cancelBooking(String bookingId) {
        return bookings.remove(bookingId) != null;
    }

    public double getRefundAmount(String bookingId) {
        HotelBooking booking = bookings.get(bookingId);
        return (booking != null) ? booking.room.price : 0;
    }
}