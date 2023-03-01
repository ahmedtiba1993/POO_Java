package org.ahmedjava.model;

public class SavinAccount extends BankAccount{

    private double interestRate;

    public SavinAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavinAccount(String c, double b, double interestRate) {
        super(c, b);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
