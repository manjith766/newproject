package com.neoteric.BookMyShow;



import java.util.HashMap;
import java.util.Map;

public class Theather {
    private String MovieName;
    private String ShowTime;
    private Map<Integer,Boolean>Seats;

    public Theather(String movieName, String showTime, int totalseats) {
      this.MovieName=movieName;
      this.ShowTime=showTime;
      this.Seats=new HashMap<>();
      for (int i=1;i<=totalseats;i++){
          Seats.put(i,false);
      }
    }
    public boolean bookseat(int seatno){
        if (Seats.containsKey(seatno)&&!Seats.get(seatno)){
            Seats.put(seatno,true);
            System.out.println("seat" +seatno+ " bookedsucessfully"  +MovieName+"  at " +ShowTime);
            return true;
        }else{
            System.out.println("seat"+seatno+"is booked");
            return false;
        }
    }
    public boolean bookSeatWithayment(int seatno,Payment payment,double Amount){
        if (bookseat(seatno)){
            double total = payment.calculateTotal(Amount);
            System.out.println("payment completed .final amount;"+total+"\n");
            return true;
        }else {
            System.out.println("Seat not avialable");
            return false;
        }
    }
    public void ShowAvailableseats(){
        System.out.print("available seats");
        for (int seatno:Seats.keySet()){
            if (Seats.get(seatno)){
                System.out.println(seatno+"");
            }
        }
        System.out.println();
    }

}
