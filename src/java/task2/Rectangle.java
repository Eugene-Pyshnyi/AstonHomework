package task2;
public class Rectangle implements RectangleInfo {
    public double width;
    public double length;
    private double perimeter;
    private double area;
    public Color areaColor = Color.YELLOW;
    public Color borderColor = Color.ORANGE;

    public Rectangle(double aSide, double bSide) {
        this.width = aSide;
        this.length = bSide;
        countRectanglePerimeter();
        countRectangleArea();
    }

    @Override
    public void countRectanglePerimeter() {
        perimeter = calculateRectanglePerameter(width, length);
    }

    @Override
    public void countRectangleArea() {
        area = calculateRectangleArea(width, length);
    }
    public void showInfo() {
        System.out.println("\nПериметр прямоугольника = " + perimeter +
                "\nПлощадь прямоугольника = " + area +
                "\nЦвет заливки: " + areaColor +
                "\nЦвет границы: " + borderColor);
    }
}
