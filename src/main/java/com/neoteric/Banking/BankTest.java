package com.neoteric.Banking;

import java.util.HashMap;
import java.util.Map;

public class BankTest {
    public static void main(String[] args) {
        Account account1 = new Account("223344", 20000);
        Account account2 = new Account("445566", 30000);
        Account account3 = new Account("334422", 40000);

        Map<String, Account> accountdata = new HashMap<>();
        accountdata.put(account1.getAccountNo(), account1);
        accountdata.put(account2.getAccountNo(), account2);
        accountdata.put(account3.getAccountNo(), account3);


        Transfer transfer = new IMPS();
        Transfer neft = new NEEFT(300000);
        Transfer rtgs = new RTgs(1000000);
        Transfer imps = new UPI();


        Account from =accountdata.get(account1);
        Account to = accountdata.get(account2);

        neft.process(account1,account2,30000);

        System.out.println("A1 balance: ₹" + account1.getBalance());
        System.out.println("A2 balance: ₹" + account2.getBalance());






    }
}
