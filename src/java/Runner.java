import task1.Animal;
import task1.Cat;
import task1.Dog;

public class Runner {
    public static void main(String[] args) {
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
    }
}
