package com.neoteric.mobilePhone;

import java.util.List;

public class Mobile {
    private Processor processor;
    private List<Camera> cameraList;
    private Display display;
    private List<Features> features;


    public Mobile(Processor processor, List<Camera> cameraList, Display display, List<Features> features) {
        this.processor = processor;
        this.cameraList = cameraList;
        this.display = display;
        this.features = features;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "processor=" + processor +
                ", cameraList=" + cameraList +
                ", display=" + display +
                ", features=" + features +
                '}';
    }
}

