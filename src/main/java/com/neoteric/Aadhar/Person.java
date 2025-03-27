package com.neoteric.Aadhar;

public class Person {
    private String name;
    private String dateofbirth;
    private String aadharNo;
    private String mobileNo;
    private String address;

    public Person(String name, String dateofbirth, String aadharNo, String mobileNo, String address) {
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.aadharNo = aadharNo;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
