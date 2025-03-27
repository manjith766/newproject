package com.neoteric.Aadhar;

public class Biometric {
   private String hands;
    private String eye;

    public Biometric(String hands, String eye) {
        this.hands = hands;
        this.eye = eye;
    }

    public String getHands() {
        return hands;
    }

    public String getEye() {
        return eye;
    }

    public void setHands(String hands) {
        this.hands = hands;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }
}
