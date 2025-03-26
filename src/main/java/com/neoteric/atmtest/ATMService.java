package com.neoteric.atmtest;

import java.util.Map;

public class ATMService {

    boolean insertCard(Card card) {
        DBService dbService = new DBService();
        Map<String, Card> cardDB = dbService.cardData;
        if (cardDB.containsKey(card.cardNo)) {
            return true;
        } else {
            return false;
        }
    }

    boolean enterpin(Pin vPin) {
        DBService dbService = new DBService();
        Map<String, Pin> pincardDB = dbService.cardPinData;
        Pin dbPin = pincardDB.get(vPin.cardNumber);
//        int vpin = Integer.parseInt(vPin.cardNumber);
//        int dbpin = Integer.parseInt(vPin.pinNumber);
        if (dbPin.pinNumber.equals(vPin.pinNumber)) {
            return true;
        } else {
            return false;
        }
    }

    boolean withdrawMoney(Card card,Pin vpin, Amount amount1) {

        DBService dbService = new DBService();
        Map<String,Amount>balance = dbService.accountData;
        Amount availbleBalance = balance.get(vpin.cardNumber);
        if(availbleBalance.balance> amount1.balance){
            double totalBalance =availbleBalance.balance-amount1.balance;

            availbleBalance.balance=totalBalance;
            return true;
        }else {
            return false;
        }



    }

    boolean checkbalance(Card card, Pin vpin) {
        Amount amount = null;
        DBService dbService = new DBService();
        if (insertCard(card)) {
            if (enterpin(vpin)) {
                Map<String, Amount> balanceMap = dbService.accountData;
                amount = balanceMap.get(card.cardNo);
            }
        }
        return false;
    }
}