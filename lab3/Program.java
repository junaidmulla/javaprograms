/*
 * Filename: Account.java
 * Project: Constructor / Default Constructor / Constructor Overloading
 * Created Date: Sunday, August 26th 2018, 10:34:25 am
 * Author: Aiman Kazi
 * 
 * Copyright (c) 2018 Visual Labs Learning Solutions
 */

class Program {
    public static void main(String[] args) {
        // creating an object of type Account
        Account aiman = new Account(1, "Aiman Kazi", "saving", 100000);
        //aiman.print();
        aiman.deposit(500);
        // aiman.print();
        aiman.withdraw(12000);
        aiman.print();

       /* 
       Account mariam = new Account(2, "Mariam Kazi", "saving", 5000);
       mariam.print();

       Account mustakim = new Account(3, "Mustakim Kadari", "Saving", 5000);
       mustakim.print();

        */

        
    }
}