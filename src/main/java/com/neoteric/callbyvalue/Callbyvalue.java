package com.neoteric.callbyvalue;

public class Callbyvalue {
    public static void main(String[] args) {
        Amount amount11= new Amount();
        amount11.amount=10000;
        amount11.Currency="INR";

        Amount amount22 = amount11;
        Amount amount33 = amount22;
        Amount amount = amount22;
        amount22.amount=20000;
        amount11 = null;
        System.out.println(amount22.amount);

    }
}
