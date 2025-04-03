package com.neoteric.BookMyShow;

public abstract class Payment {
    public abstract String getType();
    public abstract  double calculatetax(double amount);

}
