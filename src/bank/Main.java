package bank;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
     private static Bank obj = new Bank();
    public static void main(String[] args) {
        display();
    }

    public  static void display(){
        System.out.println("Welcome to Taco Bank");
        System.out.println("Press 0 to create new account\nPress 1 To make deposits\nPress 2 To withdraw\nPress 3 To make transfer\nPress 4 To check balance");
        input();
    }

    public static void input(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch(input){
            case 0: createAccount();
            break;
            case 1: deposit();
            break;
            case 2: withdraw();
            break;
            case 3: transfer();
            break;
            case 4: checkBalance();
            break;
     }

    }
    private static void checkBalance() {
        int x =1;
        do{
        try {
            System.out.println("Enter your account number");
            String accNo = scanner.next();
            System.out.println("Enter your pin");
            String pin = scanner.next();
            System.out.println("Your account balance is: " + obj.requestBalance(accNo, pin));
            System.out.println("Would you wish to perform another transaction? yes / no");
            String response = scanner.next();
            if (response.equalsIgnoreCase("yes")) {
                display();
            } else {
                System.out.println("Thank you for banking with us");
                System.exit(1);
                x = 2;
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }}
        while(x==1);
    }

    private static void transfer() {
        int x = 1;
        do{
        try{
        System.out.println("Enter account number to transfer from: ");
        String acctno = scanner.next();
        System.out.println("Enter account number to transfer to: ");
        String acctToTransferTo = scanner.next();
        System.out.println("Enter amount to transfer: ");
        int amount = scanner.nextInt();
        System.out.println("Enter account pin: ");
        String pin = scanner.next();

        obj.transfer(acctno,acctToTransferTo,amount,pin);
        System.out.println("transfer completed successfully\nWould you wish to perform another transaction? yes / no");
        String response = scanner.next();
        if (response.equalsIgnoreCase("yes")) {
            display();
        } else {
            System.out.println("Thank you for banking with us");
            System.exit(1);
            x=2;
        }}
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }}
        while (x == 1);

    }

    private static void withdraw() {
        int x = 1;
        do{
        try{
        System.out.println("Enter account number to withdraw: ");
        String acctno = scanner.next();
        System.out.println("Enter amount to withdraw: ");
        int amount = scanner.nextInt();
        System.out.println("Enter account pin: ");
        String pin = scanner.next();
        obj.withdraw(acctno, amount,pin);
        System.out.println("withdrawal completed successfully\nWould you wish to perform another transaction? yes / no");
        String response = scanner.next();
        if (response.equalsIgnoreCase("yes")) {
            display();
        } else {
            System.out.println("Thank you for banking with us");
            System.exit(1);
            x=2;
        }}
        catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
        }}while(x==1);
    }

    private static void deposit() {
        int x = 1;
        do{
        try{
        System.out.println("Enter account number to deposit: ");
        String acctno = scanner.next();
        System.out.println("Enter amount to deposit: ");
        int amount = scanner.nextInt();
        obj.deposit(acctno,amount);
        System.out.println("Deposit completed successfully\nWould you wish to perform another transaction? yes / no");
        String response = scanner.next();
        if(response.equalsIgnoreCase("yes")){display();
        }
        else{
            System.out.println("Thank you for banking with us");
            System.exit(1);
            x = 2;
        }}
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }}
        while(x==1);
    }

    private static void createAccount() {
        int x = 1;
        do{
        try {

        System.out.println("Enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Enter your second name: ");
        String secondName = scanner.next();
        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.next();
        System.out.println("Enter your pin: ");
        String pin0 = scanner.next();
        obj.registerNewAccount(firstName, secondName, phoneNumber, pin0);
        System.out.println("Account created successfully\nWould you wish to perform another transaction? yes / no");
        String resp = scanner.next();
        if (resp.equalsIgnoreCase("yes")) {
            display();
        } else {
            System.out.println("Thank you for banking with us");
            System.exit(1);
            x=2;
        }}
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }}
        while (x==1);
    }
}
