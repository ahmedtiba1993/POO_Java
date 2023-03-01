package org.ahmedjava.model;

public class CurrentAccount extends BankAccount{

    private double overDraft;

    public CurrentAccount() {
        super();
        this.overDraft = overDraft;
    }

    public CurrentAccount(String c, double b, double overDraft) {
        super(c, b);
        this.overDraft = overDraft;
    }

    @Override
    public String toString() {
        return "Current Account, Overdraft ="+overDraft+super.toString();
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }
}
