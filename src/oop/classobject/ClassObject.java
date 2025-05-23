package oop.classobject;

public class ClassObject {
    /*
    Класс — бул чийме же калып (template).
    Ал кандайдыр бир нерсенин (объекттин) өзгөчөлүктөрүн (талааларын) жана
    аракеттерин (методдорун) сүрөттөйт.
     */
    /*
    Объект — бул класстын негизинде жаралган чыныгы нерсе.
    Ал класстын негизинде жаратылып, өзүнчө мааниге ээ болот.
    Объекттер эмне кылат?
    Класста берилген маалыматтарды (талааларды) маани менен толтурат
    Методдорду колдонуп, иш-аракеттерди аткарат
    Программада бир нече экземплярды (көп нускаларды) түзүүгө шарт түзөт
     */
}
 class Car {
    String model;      // талаа
    int year;          // талаа

    void drive() {     // метод
        System.out.println(model + " унаасы жүрүп жатат.");
    }
}
class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // объект жаратуу
        // Бул жерде myCar деген объект Car классынын негизинде жаралган.


        myCar.model = "Toyota";
        myCar.year = 2020;

        myCar.drive(); // методду чакыруу
    }
}