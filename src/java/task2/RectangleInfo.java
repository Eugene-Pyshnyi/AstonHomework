package task2;

public interface RectangleInfo {
    void countRectanglePerimeter();
    void countRectangleArea();
    default double calculateRectanglePerameter(double width, double length) {
        return 2 * (width + length);
    }
    default double calculateRectangleArea(double width, double length) {
        return width * length;
    }
}
