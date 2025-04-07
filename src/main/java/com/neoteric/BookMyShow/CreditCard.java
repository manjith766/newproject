package com.neoteric.BookMyShow;

public class CreditCard extends Payment{
    @Override
    public String getType() {
        return "Credit card";
    }

    @Override
    public double ProcessingFee() {
        return 0.02;
    }
}
