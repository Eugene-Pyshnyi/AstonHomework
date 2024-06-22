package task2;

public interface RectangleInfo {
    void countRectanglePerimeter();
    void countRectangleArea();
    default double calculateRectanglePerameter(double aSide, double bSide) {
        return 2 * (aSide + bSide);
    }
    default double calculateRectangleArea(double aSide, double bSide) {
        return aSide * bSide;
    }
}
