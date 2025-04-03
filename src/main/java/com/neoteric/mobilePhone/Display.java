package com.neoteric.mobilePhone;

public class Display {
    String resolution;

    public Display(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return "Display{" +
                "resolution='" + resolution + '\'' +
                '}';
    }
}
