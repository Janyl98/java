package oop.Inheritance;

public class Inheritance {
    /*
    Inheritance деген эмне?
Inheritance (Мурастоо) — бул бир класс башка класстан маалыматтарды (
талааларды) жана методдорду мурастап алуусу.
Башкача айтканда, бир класс — экинчи класстын касиеттерин жана жүрүм-турумун
(method'дорду) колдоно алат.
Superclass (ата-эне класс) – негизги класс
Subclass (балдар класс) – мурастаган класс
     */
}
class Animal {
    String name;

    void eat() {
        System.out.println(name + " тамак жеп жатат.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println(name + " үрүп жатат.");
    }
}
class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buldog";

        myDog.eat();  // Мурастаган метод
        myDog.bark(); // Өзүнүн метод
    }
}