package com.neoteric.Aadhar;

public class Test {
        public static void main(String[] args) {
            // Create Aadhaar service
            AAdharservice aAdharservice = new AAdharservice();

            // Populate Aadhaar with personal details and biometric data
            Person person = aAdharservice.populateaadhar("John Doe", "01-01-1990", "987654321012", "9989950328", "hyd");

            // Generate OTP for Aadhaar verification
            String otp = aAdharservice.generateOtp(person.getAadharNo());

            // Simulate user entering the OTP
            String enteredOtp = "123456";  // For example purposes, this should come from user input

            // Verify OTP
            boolean otpVerified = aAdharservice.verifyOtp(person.getAadharNo(), enteredOtp);
            if (otpVerified) {
                System.out.println("OTP verified successfully!");
            } else {
                System.out.println("OTP verification failed.");
            }

            // Retrieve and display the person's data
            Person retrievedPerson = aAdharservice.getPersonByAadhar(person.getAadharNo());
            System.out.println("Retrieved Person: " + retrievedPerson.getName() + " - " + retrievedPerson.getAadharNo());

            // Retrieve and display the biometric data
            Biometric retrievedBiometric = aAdharservice.getBiometricByAadhar(person.getAadharNo());
            System.out.println("Biometric Data - Hands: " + retrievedBiometric.getHands() + ", Eyes: " + retrievedBiometric.getEye());
        }


}
