package com.neoteric.Banking;

public class IMPS extends Transfer{
    public double IMPSlimit =500000;

    @Override
    public String getType() {
        return "IMPS";
    }

    @Override
    public boolean isValidAmount(double amount) {
        return amount<=IMPSlimit;
    }

    @Override
    public double getCharges(double amount) {
        return amount*0.008;
    }
}
