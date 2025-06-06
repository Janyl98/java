package oop;
/*Cat деген класс эки талаадан турат: name (аты) жана age (жашы).
meow() методу мышыктын мияулаганы тууралуу билдирүү чыгарат.
displayInfo() методу мышыктын атын жана жашын көрсөтөт.
Main классында эки объект жаралып, аларга ар башка маанилер берилет.

 */

import oop.Encapsulation.Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Биринчи объект
        Cat cat1 = new Cat();
        cat1.name = "Murka";
        cat1.age = 2;

        // Экинчи объект
        Cat cat2 = new Cat();
        cat2.name = "Barsik";
        cat2.age = 4;

        // Методдорду чакыруу
        cat1.displayInfo();
        cat1.meow();

        System.out.println(); // Бош сап чыгарат

        cat2.displayInfo();
        cat2.meow();

        // / ////////////////////
       Encapsulation encapsulation = new Encapsulation();

        // Маалыматтарды setter менен орнотуу
        encapsulation.setName("Aibek");
       encapsulation.setAge(25);

        // Маалыматтарды getter менен алуу
        System.out.println("Аты: " + encapsulation.getName());
        System.out.println("Жашы: " + encapsulation.getAge());
    }


}
