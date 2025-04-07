package com.neoteric.AccountSummary;

import java.util.Date;

public class Transaction {
    private  String fromAccount;
    private String  toAccount;
    private String TranscctionType;
    private Date transcationDate;
    private double Amount;

    public Transaction(String fromAccount, String toAccount, String transcctionType, Date transcationDate, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        TranscctionType = transcctionType;
        this.transcationDate = transcationDate;
        Amount = amount;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public String getTranscctionType() {
        return TranscctionType;
    }

    public Date getTranscationDate() {
        return transcationDate;
    }

    public double getAmount() {
        return Amount;
    }
}
