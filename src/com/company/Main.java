package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount account= new BankAccount(20000);
        account.deposit(20000);
        account.withDraw(6000);
    }
}

