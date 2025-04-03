package com.neoteric.mobilePhone;

public class Test {

    public static void main(String[] args) {
        MobileBasicModel basicModel = new MobileBasicModel();
        Mobile mobile = basicModel.getmobile();
        System.out.println("MobileBasicModel");
        System.out.println(mobile);

        MobileMediumModel mobileMediumModel = new MobileMediumModel();
        Mobile mobile1 = mobileMediumModel.getmobile();
        System.out.println("Mobile medium model");
        System.out.println(mobile1);



    }
}
