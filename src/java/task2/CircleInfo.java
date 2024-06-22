package task2;

public interface CircleInfo {
    void countCirclePerimeter();
    void countCircleArea();
    default double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
    default double calculateCircleArea(double radius) {
        return Math.PI * (radius * radius);
    }
}
