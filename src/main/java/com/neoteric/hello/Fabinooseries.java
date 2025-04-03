package com.neoteric.hello;

public class Fabinooseries {
    static void display(int i) {
        int firstTerm = 0;
        int secondTerm = 1;
       int count = 0;

      //  while (i > secondTerm) {
       //     System.out.println("firstterm" + firstTerm + "secondterm" + secondTerm);
       //     int finalterm = firstTerm + secondTerm;
       //     firstTerm = secondTerm;
        //    secondTerm = finalterm;
      //  }

        for (;i>secondTerm;) {
            System.out.println("firstterm" + firstTerm + "secondterm" + secondTerm);
            int finalterm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = finalterm;
            count++;
            if (count == 10) break;

        }



    }

    public static void main(String[] args) {
        display(100);

    }
}
