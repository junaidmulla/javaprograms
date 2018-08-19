/*
 * Filename: Account.java
 * Project: Class and Objects 
 * Created Date: Sunday, August 19th 2018, 10:34:25 am
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

    // member function -- Takes 4 arguments (formal parameters)
    public void setInfo(int an, String hn, String t, double b) {
        accountNumber = an;
        holderName = hn;
        type = t;
        balance = b;
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