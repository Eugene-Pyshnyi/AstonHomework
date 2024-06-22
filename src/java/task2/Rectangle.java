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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Color getAreaColor() {
        return areaColor;
    }

    public void setAreaColor(Color areaColor) {
        this.areaColor = areaColor;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }
}
