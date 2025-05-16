package oop.Encapsulation;

public class Modifier {
    /*
    Модификаторлор — бул класстын, талаанын, методдун качан жана кайсы жерден колдонулушуна
    уруксат берерин көрсөтөт.
    Башкача айтканда, алар жеткиликтүүлүктү көзөмөлдөйт.
     */
}
/*
public – Ачык жеткиликтүү
Бул мүчө (метод, талаа) баардык жерден жеткиликтүү.

public class Person {
    public String name;

    public void sayHello() {
        System.out.println("Салам, менин атым " + name);
    }
}
 */
/*
private – Жашыруун
Бул мүчө жөн гана ошол эле класстын ичинен гана колдонулат.
public class BankAccount {
    private double balance;

    public void setBalance(double amount) {
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }
}
🟡 Эгер сырткы класс balance талаасына түз жеткире алгысы келсе — болбойт.
Ага жетүү үчүн get/set методдор колдонулат. Бул — инкапсуляция.
 */
/*
protected – Жарым ачык
Бул мүчө ошол эле пакетте же мурастаган (subclass) класста жеткиликтүү.
public class Animal {
    protected String type;

    protected void sleep() {
        System.out.println(type + " уктап жатат.");
    }
}
 */
/*
 (default) – Модификатор жок болсо
Эгер public, private, protected жазылбаса — бул "default" деп аталат,
жана ошол эле пакеттин ичиндеги класстар гана көрө алат.
class Student {
    String name;  // default
    void study() {
        System.out.println(name + " окуп жатат.");
    }
}
 */
/*
Модификатор	Канча ачык?	Качан колдонулат?
public	баарына	Бардык жерден жеткиликтүү болушу керек болсо
private	жабык	Ички маалыматты жашыруу үчүн (инкапсуляция)
protected	орточо	Мурастоо жана пакет ичинде колдонуу үчүн
default	чектелген	Бир гана ошол эле пакет ичинде керек болсо
 */