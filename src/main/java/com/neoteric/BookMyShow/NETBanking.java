package com.neoteric.BookMyShow;

public class NETBanking extends Payment{
    @Override
    public String getType() {
        return "netbanking";
    }

    @Override
    public double ProcessingFee() {
        return 0.05;
    }
}
