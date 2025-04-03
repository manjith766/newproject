package com.neoteric.mobilePhone;

public class Processor {
    String type;

    public Processor(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "type='" + type + '\'' +
                '}';
    }
}
