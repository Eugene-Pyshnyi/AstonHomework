package Lesson6;

public class Beginner {

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

        Park park = new Park("Dinopark");
        park.addAttraction("T-rex doll", "09:00 - 20:00", 5.00);
        park.addAttraction("Dino ferris wheel", "08:00 - 23:00", 4.5);
        park.addAttraction("Dino carousel", "10:00 - 21:00", 2);
        park.addAttraction("Dino chew", "09:00 - 20:00", 3.00);
        park.showInfo();
    }
}
