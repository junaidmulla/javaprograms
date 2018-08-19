/*
 * Filename: Account.java
 * Project: Class and Objects 
 * Created Date: Sunday, August 19th 2018, 10:34:25 am
 * Author: Aiman Kazi
 * 
 * Copyright (c) 2018 Visual Labs Learning Solutions
 */

class Program {
    public static void main(String[] args) {
        // creating an object of type Account
        Account aiman = new Account();

        // Called function passing 4 arguments
        aiman.setInfo(1, "Aiman Kazi", "saving", 1000);

        // Called function passing no arguments
        aiman.print(); // Function call

        Account mariam = new Account();
        mariam.setInfo(2, "Mariam Kazi", "saving", 5000);
        mariam.print();

    }
}