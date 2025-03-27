package com.neoteric.bank;

public class Balance {
   private Double balance;
   private String currency;
   private static final double MIN_balance = 5000;

    public Balance(Double initialDeposit,String currency) {
        this.currency = currency;
        this.balance = Math.max(initialDeposit,MIN_balance);
    }public void deposit(double amount){
        balance+= amount;
    }
    public boolean withdraw(double amount){
        if (balance - amount >= MIN_balance){
            balance -= amount;
            return true;
        }System.out.println("insufficinent funds!"+MIN_balance+"required.");
        return false;
    }

    public Double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }
}
