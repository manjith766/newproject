package com.neoteric.Banking;

public class UPI extends Transfer {

    public double UPIlimit=100000;

    @Override
    public String getType() {
        return "UPI";
    }

    @Override
    public boolean isValidAmount(double amount) {
        return amount<=UPIlimit;
    }

    @Override
    public double getCharges(double amount) {
        return amount*0.005;
    }
}
