package org.ahmedjava.model;

import java.util.UUID;

public class BankAccount {

    public String accountId;
    public double balance;
    public String currency;
    public AccountStatus status;

    public BankAccount(){
        this.accountId = UUID.randomUUID().toString();
        this.status = AccountStatus.CRATED;
    }

    public BankAccount(String c,double b){
        this();
        this.currency=c;
        this.balance=b;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId='" + accountId + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", status=" + status +
                '}';
    }
}
