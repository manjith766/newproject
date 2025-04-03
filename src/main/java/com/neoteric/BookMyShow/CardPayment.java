package com.neoteric.BookMyShow;

public class CardPayment extends  Payment{
 private String cardType;
    @Override
    public String getType() {
        return "CARD";
    }

    @Override
    public double calculatetax(double amount) {
        return 0;
    }
}
