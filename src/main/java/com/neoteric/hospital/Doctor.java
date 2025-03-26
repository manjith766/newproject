package com.neoteric.hospital;


public class Doctor {
    private String name;
    private String specialization;

    private Timeduration timeduration;



    public Doctor(String name, String specialization,  Timeduration timeduration) {
        this.name = name;
        this.specialization = specialization;

        this.timeduration = timeduration;
    }


    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }



    public Timeduration getTimeduration() {
        return timeduration;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", timeduration=" + timeduration +
                '}';
    }
}


