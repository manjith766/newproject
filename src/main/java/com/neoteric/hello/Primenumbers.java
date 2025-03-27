package com.neoteric.hello;

public class Primenumbers {
    static void printPrimeNumbers(int a){
        for (int i=0;i <=a;i++){
            boolean isPrime = true;
            for (int j=2;j*j<=i;j++){
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }if (isPrime){
                System.out.println(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        printPrimeNumbers(100);
    }
}