package com.neoteric.mobilePhone;

import java.util.ArrayList;
import java.util.List;

public class MobileMediumModel extends MobileBaseModel {



    @Override
    protected List<Camera> getCameras() {
        return List.of();
    }

    @Override
    protected Display getdisplay() {
        return new Display("1080mp");
    }

    @Override
    protected List<Features> getfeatures() {
        return List.of();
    }
}
