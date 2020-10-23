package com.company;

import java.util.Scanner;


public class BankAccount {
    private double amount;
    Scanner userInput = new Scanner(System.in);
    public BankAccount(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        this.amount= (amount+sum);
    }
    public void withDraw(int sum){
        while (true) {
            if (amount < sum) {
                try {
                    throw new LimitException("Your desired amount to withdraw is above of your money in your account", this.getAmount())
                } catch (LimitException a) {
                    System.out.println(a.getMessage() + this.amount);
                } finally {
                    System.out.println("Would you like to withdraw the remaining money(yes/no)?");
                    String answer = userInput.next();
                    if (answer.equals("yes")) {
                        withDraw((int) amount);
                        System.out.println(amount);
                    }
                    if (answer.equals("no")) {
                        break;
                    }
                }
            } (amount >= sum) {
                System.out.println(amount);
                this.amount -= sum;
                (amount == (double) 0){
                    break;
                }
            }
        }