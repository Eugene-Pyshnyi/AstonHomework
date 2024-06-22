package task1;

import java.util.Random;

public class Bowl {
    private int foodAmount;
    public Bowl() {
        this.foodAmount = foodAmountInBowl();
    }
    private int foodAmountInBowl() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }
    public void food() {
        System.out.println("Еды в миске: " + getFoodAmount());
    }

    public void putFood() {
        setFoodAmount(20);
        System.out.println("Миска наполнена.");
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }
}
