package com.rubeshsv.bible.month1.week2.day4;

/*
Interview relevance: "model a bank account" — the other classic entry-level OOP question.
Different from Dog because the methods take input and change the object's state, and the object remembers that state across calls.
Setup: class BankAccount (same package/day).
Build:
   1. One field: double balance;
   2. Three methods:
       i. void deposit(double amount) → add amount to balance
       ii. void withdraw(double amount) → subtract amount from balance
       iii. void printBalance() → print Balance: <balance>
   3. In main:
       i. create one account with new,
       ii. deposit(100), then printBalance(),
       iii. withdraw(30), then printBalance(),
   4. create a second account, deposit(500), printBalance().
   5. Expected Output
         Balance: 100.0
         Balance: 70.0
         Balance: 500.0
 */

public class BankAccount {

    double balance; // field
    void deposit(double amount){ //method
        balance=balance+amount;
    }
    void withdraw(double amount){
        balance=balance-amount;
    }
    void printBalance(){
            System.out.println("Balance: "+balance);
    }
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        account1.deposit(100.0);
        account1.printBalance();
        account1.withdraw(30.0);
        account1.printBalance();
        BankAccount account2 = new BankAccount();
        account2.deposit(500.0);
        account2.printBalance();
    }
}
