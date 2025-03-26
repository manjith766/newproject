package com.neoteric.hospital;

public class Patient {
    String name;
    String age;
    String Symptom;

    public Patient(String name, String age, String symptom) {
        this.name = name;
        this.age = age;
        Symptom = symptom;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSymptom() {
        return Symptom;
    }
}
