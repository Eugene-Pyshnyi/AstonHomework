package Lesson6;

public class Main {

    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Ivanov Ivan Ivanovich", "Engineer",
                "ivivan@mailbox.com", "89231231212", 30000, 30);
        persons[1] = new Person("Safronov Dmitriy Alexeevich", "Programmer",
                "dimon@mailbox.com", "89843639655", 70000, 28);
        persons[2] = new Person("Ling She", "Medic",
                "ling@gmail.com", "89988883634", 45000, 44);
        persons[3] = new Person("Kozlova Elena Dmitrievna", "HR",
                "kozlova22@gmail.com", "89984312629", 35000, 25);
        persons[4] = new Person("Azimov Andrei Vasilevich", "Architect",
                "azimov@rambler.ru", "89287349897", 85000, 34);
        for (Person person : persons) {
            person.showInfo();
        }
        persons[0].showInfo();
    }
}
