import task1.cats.Cat;
import task1.dogs.Dog;

public class Beginner {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        Dog dog = new Dog("Petya");
        cat.run(150);
        cat.run(300);
        cat.swim(30);
        dog.run(300);
        dog.run(600);
        dog.swim(5);
        dog.swim(30);
    }
}
