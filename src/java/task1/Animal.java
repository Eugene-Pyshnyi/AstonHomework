package task1;

public abstract class Animal {
    protected String name;
    private static int animalCount = 0;
    protected static int catCount = 0;
    protected static int dogCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public abstract void run (int distance);
    public abstract void swim(int distance);

    public String getName() {
        return name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static int getCatCount() {
        return catCount;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
