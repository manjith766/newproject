package com.neoteric.apsrtcbooking;

public class Seats {

        public String seatNumber;




        Seats(String seatNumber){
            this.seatNumber=seatNumber;

        }

        @Override
        public String toString() {
            return "Seats{" +
                    "seatNumber='" + seatNumber + '\'' +
                    '}';
        }
    }

