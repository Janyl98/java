package oop.Encapsulation;

import oop.Cat;
import oop.Encapsulation.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Encapsulation encapsulation = new Encapsulation();

        // Маалыматтарды setter менен орнотуу
        encapsulation.setName("Aibek");
        encapsulation.setAge(25);

        // Маалыматтарды getter менен алуу
        System.out.println("Аты: " + encapsulation.getName());
        System.out.println("Жашы: " + encapsulation.getAge());
        // ______________________________BankAccount
        // Объект түзүү
        BankAccount account = new BankAccount("Ermek", 10000, "1234");

        // Туура PIN колдонуп акча кошуу
        account.deposit(2000, "1234");

        // Туура эмес PIN менен акча алуу (каталык)
        account.withdraw(1000, "0000");

        // Туура PIN менен акча алуу
        account.withdraw(1500, "1234");

        // Баланс текшерүү
        double balance = account.getBalance("1234");
        if (balance != -1) {
            System.out.println("✅ Баланс: " + balance + " сом");
        }

        // Транзакция тарыхын көрсөтүү
        account.showTransactionHistory("1234");
    }
    }



