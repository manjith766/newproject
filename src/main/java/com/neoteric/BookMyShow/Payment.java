package com.neoteric.BookMyShow;

public abstract class Payment {
    protected double SERVICETAX = 0.05;
    protected double GST= 0.12;
    public abstract String getType();
    public abstract  double ProcessingFee();// fee for specific paymenttype
    public double calculateTotal(double Amount){
        double servicetaxAmount= Amount*SERVICETAX;
        double GstAmount = Amount*GST;
        double processingfee = Amount*ProcessingFee();
        double Total = Amount+servicetaxAmount+GstAmount+processingfee;
        System.out.printf(getType(),Amount,servicetaxAmount,GstAmount,processingfee,Total);
        return Total;
    }


}
