package com.neoteric.mobilePhone;

public class Camera {
    String megapixels;

    public Camera(String megapixels) {
        this.megapixels = megapixels;
    }

    public String getMegapixels() {
        return megapixels;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "megapixels='" + megapixels + '\'' +
                '}';
    }
}
