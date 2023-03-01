package org.ahmedjava;

import org.ahmedjava.model.BankAccount;

public class App1 {

    public static void main(String[] args) {


        BankAccount account1 = new BankAccount();
        account1.setBalance(100);
        account1.setCurrency("USD");
        System.out.println(account1);

        BankAccount account2 = new BankAccount("MAD",200);
        System.out.println(account2);

        if(account1.hashCode()==account2.hashCode()){
            System.out.println("les deux comptes la méme état");
        }else{
            System.out.println("les deux comptes n'ont pas méme état");

        }

    }



}
