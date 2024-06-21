package task1.dogs;

import task1.Animal;

import java.sql.SQLOutput;

public class Dog extends Animal {
    public String name;
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("\uD83D\uDC15 " + name + " пробежал " + distance + "м.");
        } else {
            System.out.println("\uD83D\uDC15 Слишком далеко!");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("\uD83D\uDC15 " + name + " проплыл " + distance + "м.");
        } else {
            System.out.println("\uD83D\uDC15 Слишком далеко!");
        }
    }
}
