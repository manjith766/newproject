package com.neoteric.mobilePhone;
import java.util.List;


public class MobileBasicModel extends MobileBaseModel {



    @Override
    protected List<Camera> getCameras() {
        return List.of();
    }

    @Override
    protected Display getdisplay() {
        return new Display("hd");
    }

    @Override
    protected List<Features> getfeatures() {
        return List.of();
    }
}
