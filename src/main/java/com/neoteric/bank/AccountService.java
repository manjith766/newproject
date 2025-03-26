package com.neoteric.bank;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AccountService {

    Map<String, Account> accountdata = new HashMap<>();
    Map<String, Balance> balancedata = new HashMap<>();
    Map<String, Nominee> nomineedata = new HashMap<>();

    public Account populateaccount(Coustmer coustmer) {

        String accountId = UUID.randomUUID().toString();

        Account account1 = new Account(accountId, coustmer.getName(), coustmer.getMobileNo(), coustmer.getAdahar(),
                coustmer.getPanNo(), coustmer.getCoustmeraddress());
        Address nomineaddress = new Address("kphb","hyd","india","5522220","5522");
        Nominee nominee = new Nominee("ram","223335500","885566","8866655",nomineaddress);
        accountdata.put(accountId, account1);
        balancedata.put(accountId, new Balance(5000.0, "INR"));
        nomineedata.put(accountId,nominee);
        return account1;

    }
    public void deposit(String accountId,double amount){
        if (balancedata.containsKey(accountId)){
            balancedata.get(accountId).deposit(amount);
        }
    }
    public void withdraw(String accountId,double amount){
        if (balancedata.containsKey(accountId)){
            balancedata.get(accountId).withdraw(amount);
        }
    }
    public void checkbalance(String accountId){
        if(balancedata.containsKey(accountId)){
            balancedata.get(accountId).getBalance();
        }
    }



}
