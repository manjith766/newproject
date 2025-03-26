package com.neoteric.employee;

public class Employe {
     public String ename;
     public String eid;
Address address;
public Employe(String ename,String eid,Address address){
    this.ename = "rama";
    this.eid = "12";
    this.address = address;

}

    @Override
    public String toString() {
        return "Employe{" +
                "ename='" + ename + '\'' +
                ", eid='" + eid + '\'' +
                ", address=" + address +
                '}';
    }
}
