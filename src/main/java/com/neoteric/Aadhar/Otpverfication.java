package com.neoteric.Aadhar;

import java.util.Random;

public class Otpverfication {
    String mobileNo;
    String otp;

    public Otpverfication(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    // Generate OTP
    public String generateOtp() {
        Random random = new Random();
        otp = String.format("%06d", random.nextInt(1000000));
        System.out.println("OTP generated: " + otp);  // For testing purposes, print the OTP
        return otp;
    }
    public boolean verifyOtp(String inputOtp) {
        return otp.equals(inputOtp);
    }    
}
