/*
 * Filename: Account.java
 * Project: Constructor / Default Constructor / Constructor Overloading
 * Created Date: Sunday, August 26th 2018, 10:34:25 am
 * Author: Aiman Kazi
 * 
 * Copyright (c) 2018 Visual Labs Learning Solutions
 */

// class is a blue print
class Account {
    // member variables
    private int accountNumber;
    private String holderName;
    private String type;
    private double balance;

    // default constructor - constructor with no parameters
    public Account() {
        System.out.println("I am default constructor");
    }

    // constructor with parameters
    public Account(int an, String hn, String t, double b) {
        System.out.println("------------------------------------");
        System.out.println("I am parameterized constructor with 4 params");
        accountNumber = an;
        holderName = hn;
        type = t;
        balance = b;

    }

    public void deposit(int amount)
    {
        balance += amount;
    }

    public void withdraw(int amount)
    {
        if (amount > 25000) {
            System.out.println("Amount limit exceeded.");
        }
        else{
            if(amount>balance)
            {
                System.out.println("Your balance is less than withdraw amount");
            }
            else
            {
                balance -= amount;   
                System.out.println("Withdraw Operation Done.");
            }
        }
       
    }
    
    // member function -- no parameters
    public void print() {
        System.out.println("------------------------------------");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Type: " + type);
        System.out.println("Balance: " + balance);
    }
}