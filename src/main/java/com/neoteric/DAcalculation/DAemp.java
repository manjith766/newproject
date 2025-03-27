package com.neoteric.DAcalculation;

import java.util.Date;

public class DAemp {
    private Date fromDate;
    private String percentage;

    public DAemp(String fromdate,String percentage) {
        this.fromDate = new Date(String.valueOf(fromdate));
        this.percentage = percentage;
    }

    public Date getFromdate() {
        return fromDate;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setFromdate(Date fromdate) {
        this.fromDate = fromdate;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "DAemp{" +
                "fromDate=" + fromDate +
                ", percentage='" + percentage + '\'' +
                '}';
    }
}
