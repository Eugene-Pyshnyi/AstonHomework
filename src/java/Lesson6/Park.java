package Lesson6;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private String name;

    private List<Attraction> attractions;
    public Park() {

    }

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String info, String workHours, double price) {
        Attraction attraction = new Attraction(info, workHours, price);
        attractions.add(attraction);
    }

    public void showInfo() {
        System.out.println(name);
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }
    public class Attraction{
        private String name;
        private String workHours;
        private double price;
        public Attraction() {

        }
        public Attraction(String info, String workTime, double price) {
            this.name = info;
            this.workHours = workTime;
            this.price = price;
        }
        @Override
        public String toString() {
            return "Attraction name: " + name + "\n" +
                    "Working hours: " + workHours + "\n" +
                    "Price: $" + price + "\n";
        }
    }
}
