package com.neoteric.Banking;

public class Account {
     private String accountNo;
     private double balance;

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

   public double getBalance(){
        return balance;
   }

    public void deposit(double amount){
        balance+=amount;

    }
    public void withdrawl(double amount){
        balance-= amount;
    }
}
