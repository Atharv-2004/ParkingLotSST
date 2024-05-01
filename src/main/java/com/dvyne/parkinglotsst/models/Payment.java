package com.dvyne.parkinglotsst.models;

import java.util.Date;

public class Payment extends BaseModel{
    private int amount ;
    private PaymentStatus  paymentStatus ;
    private Date time;
    private PaymentMode paymentMode ;
    private String reffernceNumber;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getReffernceNumber() {
        return reffernceNumber;
    }

    public void setReffernceNumber(String reffernceNumber) {
        this.reffernceNumber = reffernceNumber;
    }
}
