package com.neoteric.hospital;

public class Appointment {
   private Doctor doctor;
    private Patient patient;


    private String appointmentTime;


    public Appointment(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentTime= doctor.getTimeduration().bookSlot();
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                ", appointmentTime='" + appointmentTime + '\'' +
                '}';
    }
}
