package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, User!");

        org.example.Payroll payroll = new org.example.Payroll();
        payroll.findLoadAndPrint();
    }
}

// FINALLY I GOT IT TO READ THE CSV FILE MY GOD THAT TOOK FOREVER