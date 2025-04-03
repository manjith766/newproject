package com.neoteric.inheritance;

import java.util.List;

public class Car {


    private Engine engine;
    private List<Wheel>wheelList;
    private List<Lights>lightsList;

    public Car(Engine engine, List<Wheel> wheelList, List<Lights> lightsList) {
        this.engine = engine;
        this.wheelList= wheelList;
        this.lightsList=lightsList;
    }
}
