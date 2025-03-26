package com.neoteric.hospital;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Timeduration {
    private List<String> availableSlots = new ArrayList<>();
    private LocalTime startTime;
    private LocalTime endTIme;

    public Timeduration( LocalTime startTime, LocalTime endTIme) {

        generatetimeslots(startTime,endTIme);
    }

    public void generatetimeslots(LocalTime startTime,LocalTime endTIme){
        LocalTime time = startTime;
        while (time.isBefore(endTIme)){
            availableSlots.add(time.toString());
        time = time.plusMinutes(30);
        }
    }
    public String bookSlot(){
        return availableSlots.isEmpty()? "no available slots":availableSlots.remove(0);
    }

    public List<String> getAvailableSlots() {
        return availableSlots;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTIme() {
        return endTIme;
    }

    @Override
    public String toString() {
        return "Timeduration{" +
                "availableSlots=" + availableSlots +
                ", startTime=" + startTime +
                ", endTIme=" + endTIme +
                '}';
    }
}
