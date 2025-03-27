package com.neoteric.atmtest;

public class Test {
    public static void main(String[] args) {
ATMService atmService= new ATMService();
DBService dbService = new DBService();
Card card = new Card();
card.cardNo="22334455";
card.cardholderName="rama";
card.balance=50000;

Pin pin=new Pin();
pin.pinNumber="2233";
pin.cardNumber="22334455";
Amount amount = new Amount();
amount.balance=40000;
amount.cardno="22334455";
        boolean result = atmService.insertCard(card);
        System.out.println(result);

        boolean hlo = atmService.enterpin(pin);
        System.out.println(hlo);

        boolean result1 = atmService.withdrawMoney(card,pin,amount);
        System.out.println(result1 );
    }
    }
