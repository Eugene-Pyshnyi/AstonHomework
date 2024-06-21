package task1;

import task1.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("\uD83D\uDC15 " + name + " пробежал " + distance + "м.");
        } else {
            System.out.println("\uD83D\uDC15 " + name + " не может пробежать " + distance + " метров!");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("\uD83D\uDC15 " + name + " проплыл " + distance + "м.");
        } else {
            System.out.println("\uD83D\uDC15 " + name + " не может проплыть " + distance + " метров!");
        }
    }
}
