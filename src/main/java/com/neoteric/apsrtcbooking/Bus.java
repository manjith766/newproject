package com.neoteric.apsrtcbooking;

import java.util.Arrays;

public class Bus {

    String busNumber;

    String serviceNo;

    String fromDate;

    String toDate;

    String fromLocation;

    String toLocation;

    String type;

    Seats[] seat;

    public Bus(String busNumber, String serviceNo, String fromDate, String toDate, String fromLocation, String toLocation, String type) {
        this.busNumber = busNumber;
        this.serviceNo = serviceNo;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.type = type;
        this.seat =initilizationSeats();

    }

    public Seats[] initilizationSeats() {
        Seats[]seats =new Seats[5];
        for(int i=0;i<seats.length;i++){
            seats[i]=new  Seats(String.valueOf(i+1));
        }
        return seat;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNumber='" + busNumber + '\'' +
                ", serviceNo='" + serviceNo + '\'' +
                ", fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", fromLocation='" + fromLocation + '\'' +
                ", toLocation='" + toLocation + '\'' +
                ", type='" + type + '\'' +
                ", seat=" + Arrays.toString(seat) +
                '}';
    }


}
