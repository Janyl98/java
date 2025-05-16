package oop.Encapsulation;
/*
Инкапсуляциянын артыкчылыктары:
Маалыматты коргойт
Кодду көзөмөлдөөнү жакшыртат
Ички түзүлүштү жашырат (data hiding)
Келечекте оңдоо жана өзгөртүү жеңил болот
 */
public class Encapsulation {
    /*
        Инкапсуляция (Encapsulation) — бул объектке тиешелүү маалыматтарды (талааларды)
        жана алар менен иштөөчү методдорду бир класстын ичинде жаап коюу процесси.
        Бул объект-баалуу (OOP) программалоонун негизги принциптеринин бири болуп эсептелет.
     */
    /*
        Java'да инкапсуляция кандай иштейт?
        1. Талааларды private кылып жарыялайбыз
        Бул маалыматты түздөн-түз тышкы класстардан өзгөртүүгө же окууга болбойт.
        2. public getter жана setter методдорун түзөбүз
        Бул методдор талааларга коопсуз жетүүгө мүмкүнчүлүк берет.
     */
    // Талаалар инкапсуляцияланган
    private String name;
    private int age;
    // Getter методу (маалыматты алуу)
    public String getName() {
        return name;
    }

    // Setter методу (маалыматты орнотуу)
    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        } else {
            System.out.println("Жаш терс болбойт!");
        }
    }

}
