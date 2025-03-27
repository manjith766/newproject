package com.neoteric.bank;

public class Nominee {
    private String name;
    private String mobileNo;
    private String adahar;
    private String panNo;
    Address nomineeaddress;

    public Nominee(String name, String mobileNo, String adahar, String panNo, Address nomineeaddress) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.adahar = adahar;
        this.panNo = panNo;
        this.nomineeaddress = nomineeaddress;
    }

    public String getName() {
        return name;
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

    public Address getNomineeaddress() {
        return nomineeaddress;
    }

}
