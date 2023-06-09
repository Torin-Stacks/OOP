package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {


    private List<Account> accounts = new ArrayList<>();
    private int counter;

    public void registerNewAccount(String firstName, String secondName, String phoneNumber, String pin) {
     Account acc = new Account(firstName,secondName,phoneNumber,pin);
     String newacctno = generateAccountNumber(phoneNumber);
     acc.setAccountNumber(newacctno);
     System.out.println(returnAccountNumber(acc.getAccountNumber()));
     accounts.add(acc);
     counter++;
    }

    public String returnAccountNumber(String accNo){
        return String.format("Your account number is: "+ accNo);
    }

     public int getCounter(){return counter;
     }

    public String generateAccountNumber(String phoneNumber){
        String acctNo = "";
        if(phoneNumber.startsWith("0")){
             acctNo = phoneNumber.substring(1);
        }
        return acctNo;
    }

    public void deposit(String acctNumber, int amount) {
        for(Account acc : accounts) {

        if (!acc.getAccountNumber().equals(acctNumber)){
            throw new IllegalArgumentException("Wrong account number");
        }
        else{
            acc.deposit(amount);
        }}

    }

    public int requestBalance(String acctno,String pin){
        for(Account acc:accounts){
            if(acc.getAccountNumber().equals(acctno)){
                return acc.checkBalance(pin);
            }
        }
        return 0;

    }

    public void withdraw(String accno, int amount, String pin) {
        for(Account acc : accounts) { if (!acc.getAccountNumber().equals(accno)){
            throw new IllegalArgumentException("Wrong account number");
        }
        else{
            acc.withdraw(pin, amount);
        }}
    }

    public void transfer(String sender, String recipient, int amount, String pin) {
        for (Account acc: accounts){
            if (sender.equals(acc.getAccountNumber())) {
                acc.withdraw(pin,amount);
            }

            if (recipient.equals(acc.getAccountNumber())) {
                acc.deposit(amount);
            }
       }
    }
}
