import task1.Animal;
import task1.Bowl;
import task1.Cat;
import task1.Dog;
import task2.Circle;
import task2.Rectangle;
import task2.Triangle;

public class Runner {
    public static void main(String[] args) {
        //task 1.1
        Cat barsik = new Cat("Барсик");
        Cat phobos = new Cat("Фобос");
        Cat persik = new Cat("Персик");
        Dog bobik = new Dog("Бобик");
        Dog wolf = new Dog("Волк");
        Dog sharik = new Dog("Шарик");
        Dog tuzik = new Dog("Тузик");

        barsik.run(150);
        phobos.run(300);
        persik.swim(30);
        bobik.run(0);
        wolf.run(600);
        sharik.swim(0);
        tuzik.swim(30);
        System.out.println();

        //task 1.2
        Bowl bowl = new Bowl();
        Cat[] kittens = new Cat[5];
        kittens[0] = new Cat("Чиби");
        kittens[1] = new Cat("Чёрный");
        kittens[2] = new Cat("Гараж");
        kittens[3] = new Cat("Снежок");
        kittens[4] = new Cat("Васька");
        for (Cat kitten : kittens) {
            bowl.food();
            kitten.eat(bowl);
            bowl.putFood();
        }

        System.out.println("\nКотиков всего: " + Cat.getCatCount() + "\n" +
                "Собачек всего: " + Dog.getDogCount() + "\n" +
                "Животных всего: " + Animal.getAnimalCount() + "\n");

        //task 2
        Circle circle = new Circle(4.5);
        circle.showInfo();

        Triangle triangle = new Triangle(8, 8, 4);
        triangle.showInfo();

        Rectangle rectangle = new Rectangle(8, 5);
        rectangle.showInfo();
    }
}
