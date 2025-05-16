package oop.Constructor;

public class Main {
    public static void main(String[] args) {
        // Объект түзүү жана конструктор аркылуу маанилерди берүү
        Person person1 = new Person("Aizada", 22);
        Person person2 = new Person("Bekzat", 30);

        person1.displayInfo();
        System.out.println();
        person2.displayInfo();
    }
}
