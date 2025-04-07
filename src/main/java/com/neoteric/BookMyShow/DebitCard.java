package com.neoteric.BookMyShow;

public class DebitCard extends Payment{
    @Override
    public String getType() {
        return "DebitCard";
    }

    @Override
    public double ProcessingFee() {
        return 0.01;
    }
}
