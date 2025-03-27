package com.neoteric.hotelBokking;

public class HotelBooking {
    private String bookingId;
    private String hotelName;
    Location hotelLocation;
    Room room;
    private int adults;
    private int childern;

    public HotelBooking(String bookingId, String hotelName, Location hotelLocation, Room room, int adults, int childern) {
        this.bookingId = bookingId;
        this.hotelName = hotelName;
        this.hotelLocation = hotelLocation;
        this.room = room;
        this.adults = adults;
        this.childern = childern;

    }

    public String getBookingId() {
        return bookingId;
    }

    public String getHotelName() {
        return hotelName;
    }

}
