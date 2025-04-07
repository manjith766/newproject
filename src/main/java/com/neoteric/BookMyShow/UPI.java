package com.neoteric.BookMyShow;

public class UPI extends Payment{
    @Override
    public String getType() {
        return "UPI";
    }

    @Override
    public double ProcessingFee() {
        return 0.005;
    }
}
