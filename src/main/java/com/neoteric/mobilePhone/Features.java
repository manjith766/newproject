package com.neoteric.mobilePhone;

public class Features {
    String name;

    public Features(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Features{" +
                "name='" + name + '\'' +
                '}';
    }
}
