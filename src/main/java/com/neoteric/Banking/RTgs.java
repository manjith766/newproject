package com.neoteric.Banking;

public class RTgs extends Transfer{
    public double banklimit;

    public RTgs(double banklimit) {
        this.banklimit = banklimit;
    }

    @Override
    public String getType() {
        return "rtgs";
    }

    @Override
    public boolean isValidAmount(double amount) {
        return amount>=200000&&amount<=banklimit;
    }

    @Override
    public double getCharges(double amount) {
        return amount*0.015;
    }
}
