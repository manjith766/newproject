package com.neoteric.studentdemo;

public class Student {
    public static void main(String[] args) {

        Address studentAddress = new Address();
        studentAddress.city= "kukatpally";
        studentAddress.district="kphb";
        studentAddress.houseNo="2-33";
        studentAddress.pincode="52205";
        studentAddress.state="hyd";

        Address schoolAddress = new Address();
        schoolAddress.state="hyd";
        schoolAddress.pincode="52200";
        schoolAddress.houseNo="33";
        schoolAddress.district="miyapur";
        schoolAddress.city="hello";

        Studentform student = new Studentform();
        student.name ="manjith";
        student.age=22;
        student.mobileNo="998995021";
        student.rollNo="22";
        student.standard="8th";
        student.studentAddress=studentAddress;
        student.schoolAddress=schoolAddress;

        System.out.println(student);



        Address studentAddress1 = new Address();
        Address studentAddress2= new Address();
        Address studentAddres3= new Address();
        Address studentAddress4 = new Address();
        Address studentAddress5 = new Address();


        Address studentAddress6 = new Address();
        Address studentAddress7 = new Address();
        Address studentAddress8 = new Address();
        Address studentAddress9 = new Address();
        Address studentAddress11 = new Address();


        Address studentAddress12 = new Address();
        Address studentAddress13= new Address();
        Address studentAddress14 = new Address();
        Address studentAddress15 = new Address();
        Address studentAddress16 = new Address();

    }
}
