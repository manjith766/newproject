package com.neoteric.bank;

public class Account {
    private String accountno;
    private String mobileNo;
    private String adahar;
    private String panNo;
    Address bankaddress;
    Nominee nominee;
    Balance balance;

    public Account(Balance balance) {
        this.balance = balance;
    }

    public Account(Nominee nominee) {
        this.nominee = nominee;
    }

    public Account(String accountno, String mobileNo, String adahar, String panNo, String no, Address bankaddress)

     {
        this.accountno = accountno;
        this.mobileNo = mobileNo;
        this.adahar = adahar;
        this.panNo = panNo;
        this.bankaddress = bankaddress;
     }

    public Account() {

    }

    public Balance getBalance() {
        return balance;
    }

    public String getAccountno() {
        return accountno;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getAdahar() {
        return adahar;
    }

    public String getPanNo() {
        return panNo;
    }

    public Address getBankaddress() {
        return bankaddress;
    }
    public Nominee nominee() {
        return nominee;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountno='" + accountno + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", adahar='" + adahar + '\'' +
                ", panNo='" + panNo + '\'' +
                ", bankaddress=" + bankaddress +
                ", nominee=" + nominee +
                ", balance=" + balance +
                '}';
    }
}
