package com.neoteric.mobilePhone;

import java.util.ArrayList;
import java.util.List;

public abstract class MobileBaseModel {
    public MobileBaseModel(){
        System.out.println("from mpbile base model" );
    }
    public  Mobile getmobile(){
        Processor processor = getProcessor();
        List<Camera> cameras = new ArrayList<>();
        cameras.add(new Camera("720"));

        Display display= getdisplay();

        List<Features>features=new ArrayList<>();
        features.add(new Features("no"));
        Mobile mobile = new Mobile(processor,cameras,display,features);
        return mobile;
    }
    public Processor getProcessor(){
        return new Processor("snapdragon 99");
      }
    protected abstract List<Camera> getCameras();
    protected abstract Display getdisplay();
    protected abstract List<Features> getfeatures();

}

