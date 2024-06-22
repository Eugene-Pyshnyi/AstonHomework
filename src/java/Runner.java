import task1.Animal;
import task1.Bowl;
import task1.Cat;
import task1.Dog;
import task2.Circle;
import task2.Rectangle;
import task2.Triangle;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Test");
        Cat cat1 = new Cat("Test1");
        Cat cat2 = new Cat("Test2");
        Bowl bowl = new Bowl();
        bowl.food();
        cat.eat(bowl);
        cat1.eat(bowl);
        cat2.eat(bowl);
        bowl.food();
        bowl.putFood();
        bowl.food();
        cat.eat(bowl);

        //task 1
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
        bobik.run(300);
        wolf.run(600);
        sharik.swim(5);
        tuzik.swim(30);

        System.out.println("Котиков всего: " + Animal.getCatCount());
        System.out.println("Собачек всего: " + Animal.getDogCount());
        System.out.println("Животных всего: " + Animal.getAnimalCount());

        //task 2
        Circle circle = new Circle(4.5);
        circle.showInfo();

        Triangle triangle = new Triangle(8, 8, 4);
        triangle.showInfo();

        Rectangle rectangle = new Rectangle(8, 5);
        rectangle.showInfo();
    }
}
