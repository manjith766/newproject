package com.neoteric.hotelBokking;

public class BookingCancellation {
    String bookingId;
    String reason;
    double refundAmount;

    public BookingCancellation(String bookingId, String reason, double refundAmount) {
        this.bookingId = bookingId;
        this.reason = reason;
        this.refundAmount = refundAmount;
    }
}