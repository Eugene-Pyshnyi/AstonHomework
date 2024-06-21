package task1;

import task1.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("\uD83D\uDC08 " + name + " пробежал " + distance + "м.");
        } else {
            System.out.println("\uD83D\uDC08 " + name + " не может пробежать " + distance + " метров!");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("\uD83D\uDC08 Котики не умеют плавать!");
    }
}
