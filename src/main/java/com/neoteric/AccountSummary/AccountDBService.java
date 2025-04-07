package com.neoteric.AccountSummary;

import java.util.*;

public class AccountDBService {

    public static Map<String, List<Transaction>>accountTranscation =new HashMap<>();


    public AccountDBService(){

    }
    public void populateData(){
        List<Transaction>transactionList=new ArrayList<>();

        Transaction transaction=new Transaction("123456","223344","Debit",new Date(),10000.0);
        Transaction transaction1= new Transaction("22334","123456","Credit",new Date(),20000.0);
        transactionList.add(transaction);
        transactionList.add(transaction1);
        accountTranscation.put("123456",transactionList);

    }

    public List<Transaction>getAccountData(String accountNumber){
         List<Transaction>transactionList=accountTranscation.get(accountNumber);
         return transactionList;
    }


}
