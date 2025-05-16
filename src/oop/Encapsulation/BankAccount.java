package oop.Encapsulation;

import java.util.ArrayList;

public class BankAccount {
    // Инкапсуляцияланган талаалар
    private String ownerName;
    private double balance;
    private String pinCode; // PIN-код
    private ArrayList<String> transactionHistory; // Тарых
    // Конструктор (кааласаңыз)
    public BankAccount(String ownerName, double initialBalance, String pinCode) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.pinCode = pinCode;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Эсеп ачылды. Баштапкы баланс: " + initialBalance + " сом.");
    }

    // Getter
    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance(String enteredPin) {
        if (checkPin(enteredPin)) {
            return balance;
        } else {
            System.out.println("❌ PIN туура эмес!");
            return -1;
        }
    }

    // Setter
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Метод: акча кошуу
    public void deposit(double amount, String enteredPin) {
        if (checkPin(enteredPin)) {
            if (amount > 0) {
                balance += amount;
                String record = "+ " + amount + " сом кошулду.";
                transactionHistory.add(record);
                System.out.println(record);
            } else {
                System.out.println("❌ Туура эмес сумма!");
            }
        } else {
            System.out.println("❌ PIN туура эмес!");
        }
    }

    // Метод: акча алуу
    public void withdraw(double amount, String enteredPin) {
        if (checkPin(enteredPin)) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                String record = "- " + amount + " сом алынды.";
                transactionHistory.add(record);
                System.out.println(record);
            } else {
                System.out.println("❌ Баланс жетишсиз же туура эмес сумма!");
            }
        } else {
            System.out.println("❌ PIN туура эмес!");
        }
    }
    public void showTransactionHistory(String enteredPin) {
        if (checkPin(enteredPin)) {
            System.out.println("📜 Транзакция тарыхы:");
            for (String transaction : transactionHistory) {
                System.out.println(" - " + transaction);
            }
        } else {
            System.out.println("❌ PIN туура эмес!");
        }
    }

    private boolean checkPin(String enteredPin) {
        return this.pinCode.equals(enteredPin);
    }
}
