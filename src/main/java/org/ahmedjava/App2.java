package org.ahmedjava;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.ahmedjava.model.BankAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App2 {
    public static void main(String[] args) throws JsonProcessingException{

        //Tableau
        BankAccount[] account = new BankAccount[4];
            account[0]=new BankAccount("USD",100);
            account[1]=new BankAccount("TND",300);
            account[2]=new BankAccount("EUR",50);
            account[3]=new BankAccount("USD",66);


        for(int i=0 ; i<account.length ; i++){
            System.out.println(account[i].toString());
        }
        System.out.println("************");

        for(BankAccount acc:account){
            System.out.println(acc.toString());
        }

        System.out.println("*****ArrayList*******");
        List<BankAccount> bankAccountList = new ArrayList<>();
            bankAccountList.add(new BankAccount("USD",100));
            bankAccountList.add(new BankAccount("TND",10));
            bankAccountList.add(new BankAccount("EUR",80));
            bankAccountList.add(new BankAccount("USD",63));

         for(BankAccount acc:bankAccountList){
            System.out.println(acc.toString());
        }

        System.out.println("*****HashMap*******");
        Map<String , BankAccount> bankAccountMap = new HashMap<>();
            bankAccountMap.put("acc1",new BankAccount());
            bankAccountMap.put("acc2",new BankAccount());
            bankAccountMap.put("acc3",new BankAccount());
            bankAccountMap.put("acc4",new BankAccount());

        BankAccount bankAccount = bankAccountMap.get("acc1");
        System.out.println(bankAccount);

        for(String key : bankAccountMap.keySet()){
            System.out.println(bankAccountMap.get(key));
        }

        for(BankAccount ba:bankAccountMap.values()){
            System.out.println(toJson(ba));
        }

    }

    public static String toJson(Object o) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
    }
}
