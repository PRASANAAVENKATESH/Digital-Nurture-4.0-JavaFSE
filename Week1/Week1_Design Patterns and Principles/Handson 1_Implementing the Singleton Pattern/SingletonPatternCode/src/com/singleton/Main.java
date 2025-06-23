package com.singleton;
public class Main {
	
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        l1.log("Hello");

        Logger l2 = Logger.getInstance();
        l2.log("World");

        System.out.println(l1 == l2); 
    }
}
