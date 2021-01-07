package com.example.demo.model;

public class BankAccount {
    String name;
    Double balance;
    String animalType;

    public BankAccount(String name, Double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public String getBalanceFormatted(){
        return String.format("%.2f",balance);
    }

    public String getAnimalType() {
        return animalType;
    }
}
