package oop.Constructor;

public class Person {
    String name;
    int age;

    // 👉 Конструктор
    public Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    void displayInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жашы: " + age);
    }
}
