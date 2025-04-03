package com.neoteric.Banking;

public class NEEFT extends Transfer {
    public double bankLimit;

    public NEEFT(double bankLimit) {
        this.bankLimit = bankLimit;
    }

    @Override
    public String getType() {
        return "NEEFT";
    }

    @Override
    public boolean isValidAmount(double amount) {
        return amount<=bankLimit;
    }

    @Override
    public double getCharges(double amount) {
        return amount*0.01;
    }
}
