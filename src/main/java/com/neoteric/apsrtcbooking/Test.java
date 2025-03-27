package com.neoteric.apsrtcbooking;

    public class Test {

        public static void main(String[] args) {

           Bus bus=new Bus("1","2","12/3/2025","15/3/2025","hyd","vij","AC" );
           Bus bus1=new Bus("2","2","12" ,"45" ,"huids","kjhuh","ju");
           Bus bus2 =new Bus("1","l","45","l","sas","lklk","gh");

           Seats s1=new Seats("1");
           Seats s2 = new Seats("2");

            System.out.println(bus);
            System.out.println(bus1);
            System.out.println( bus2);
            System.out.println(s1);
            System.out.println(s2);
        }

    }

