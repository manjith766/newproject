package com.neoteric.student1;

public class Student {
    String sname;
    String sno;
    String sclass;
    Address address;

   public Student(){

   }

    public  Student(String sname, String sno, String sclass, Address address,Address address1 ){
        this.sname = "ram";
        this.sno = "122";
        this.sclass = "4th";
        this.address = address;

    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", sno='" + sno + '\'' +
                ", sclass='" + sclass + '\'' +
                ", address=" + address +
                '}';
    }
}
