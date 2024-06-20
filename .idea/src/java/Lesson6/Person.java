package Lesson6;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person() {
    }

    public Person(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void showInfo() {
        System.out.printf("Name: %s,\nAge: %d,\nPosition: %s,\nEmail: %s,\nPhone number: %s,\nSalary: %d.\n",
                fullName, age, position, email, phoneNumber, salary);
        System.out.println();
    }
}
