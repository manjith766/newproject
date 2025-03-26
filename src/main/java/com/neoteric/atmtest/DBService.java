package com.neoteric.atmtest;

import java.util.HashMap;

import java.util.Map;

public class DBService {

    Map<String,Card>cardData = new HashMap<>();
    Map<String,Pin>cardPinData = new HashMap<>();
    Map<String, Amount>accountData = new HashMap<>();

    public DBService(){
        populateData();
        populatepinData();
        populateaccountData();

    }
    public void populateData(){
        Card card1 = new Card();
        card1.cardholderName ="neoteric";
        card1.cardNo="22334455";
        card1.fromDate="22/12/2025";
        card1.toDate="22/12/2027";
        cardData.put(card1.cardNo, card1);
    }

    public void populatepinData(){
        Pin pin1 = new Pin();
        pin1.pinNumber = "2233";
        pin1.cardNumber="22334455";
        cardPinData.put(pin1.cardNumber, pin1);

    }

    public void populateaccountData(){
        Amount account = new Amount();
        account.cardno="22334455";
        account.balance=50000.0;
        accountData.put("22334455",account);
    }
}