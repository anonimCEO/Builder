package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount bankAccount = new BankAccount.Builder(1253)
                .withOwner("Brian")
                .withBranch("Central")
                .openBalance(2500.00)
                .withInterestRate(0.07)
                .build();

        BankAccount bankAccount1 = new BankAccount.Builder(2254)
                .openBalance(256)
                .withBranch("National")
                .withInterestRate(0.03)
                .withOwner("Karlson")
                .build();
        System.out.println(bankAccount);
        System.out.println(bankAccount1);
    }
}
