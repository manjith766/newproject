package com.neoteric.bank;

public class Coustmer {
    private String name;
    private String mobileNo;
    private String adahar;
    private String panNo;
    Address coustmeraddress;


    public Coustmer(String name, String mobileNo, String adahar, String panNo, Address coustmeraddress) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.adahar = adahar;
        this.panNo = panNo;
        this.coustmeraddress = coustmeraddress;
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

    public Address getCoustmeraddress() {
        return coustmeraddress;
    }
}
