package task2;
public class Circle implements CircleInfo {
    private double perimeter;
    private double area;
    public double radius;
    public Color borderColor = Color.WHITE;
    public Color areaColor = Color.BLACK;
    public Circle(double radius) {
        this.radius = radius;
        countCirclePerimeter();
        countCircleArea();
    }
    @Override
    public void countCirclePerimeter() {
        perimeter = calculateCirclePerimeter(radius);
    }
    @Override
    public void countCircleArea() {
        area = calculateCircleArea(radius);
    }
    public void showInfo() {
        System.out.println("\nПериметр круга = " + perimeter +
                "\nПлощадь круга = " + area +
                "\nЦвет заливки: " + areaColor +
                "\nЦвет границы: " + borderColor);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Color getBorderColor() {
        return borderColor;
    }
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }
    public Color getAreaColor() {
        return areaColor;
    }
    public void setAreaColor(Color areaColor) {
        this.areaColor = areaColor;
    }
}
