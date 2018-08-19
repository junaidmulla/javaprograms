
/*
 * Filename: Property.java
 * Project: Understand System 
 * Created Date: Sunday, August 19th 2018, 10:17:55 am
 * Author: Aiman Kazi
 * 
 * Copyright (c) 2018 Visual Labs Learning Solutions
 */
import java.util.*;

class Property {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.getProperties().list(System.out);
        System.out.println("--- Memory Usage ---");
        Runtime rt = Runtime.getRuntime();
        System.out.println("---Total Memory = " + rt.totalMemory() + " Free Memory = " + rt.freeMemory());
    }
}
