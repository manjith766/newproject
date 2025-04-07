package com.neoteric.BookMyShow;

public class BookTickectTest {

    public static void main(String[] args) {
        Theather theaterShow = new Theather("Avengers", "9:30 PM", 10);

        Payment credit = new CreditCard();
        Payment debit = new DebitCard();
        Payment upi = new UPI();
        Payment netBanking = new NETBanking();

        theaterShow.ShowAvailableseats();

        theaterShow.bookSeatWithayment(1,credit,200);
        theaterShow.bookSeatWithayment(1,debit,200);
        theaterShow.bookSeatWithayment(3,upi,200);
        theaterShow.bookSeatWithayment(3,netBanking,200);

        theaterShow.ShowAvailableseats();
    }
}

