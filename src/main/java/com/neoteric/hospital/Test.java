package com.neoteric.hospital;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        Timeduration timeduration = new Timeduration(LocalTime.of(9, 0), LocalTime.of(12, 0));
        Doctor doctor = new Doctor("Dr. Smith", "Cardiologis",timeduration);

        // Step 3: Create Patients
        Patient patient1 = new Patient("John Doe", "40", "Chest Pain");
        Patient patient2 = new Patient("Alice", "35", "Headache");
        List<Appointment> appointments = new ArrayList<>();
        appointments.add(new Appointment(doctor, patient1));
        appointments.add(new Appointment(doctor, patient2));
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }

    }
}