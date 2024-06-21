package task1.cats;

import task1.Animal;

public class Cat extends Animal {
    private String name;
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("\uD83D\uDC08 " + name + " пробежал " + distance + "м.");
        } else {
            System.out.println("\uD83D\uDC08 Слишком далеко!");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("\uD83D\uDC08 Котики не умеют плавать!");
    }
}
