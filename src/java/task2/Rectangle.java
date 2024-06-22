package task2;
public class Rectangle implements RectangleInfo {
    public double aSide;
    public double bSide;
    private double perimeter;
    private double area;
    public Color areaColor = Color.YELLOW;
    public Color borderColor = Color.ORANGE;

    public Rectangle(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        countRectanglePerimeter();
        countRectangleArea();
    }

    @Override
    public void countRectanglePerimeter() {
        perimeter = calculateRectanglePerameter(aSide, bSide);
    }

    @Override
    public void countRectangleArea() {
        area = calculateRectangleArea(aSide, bSide);
    }
    public void showInfo() {
        System.out.println("\nПериметр прямоугольника = " + perimeter +
                "\nПлощадь прямоугольника = " + area +
                "\nЦвет заливки: " + areaColor +
                "\nЦвет границы: " + borderColor);
    }

    public double getaSide() {
        return aSide;
    }

    public void setaSide(double aSide) {
        this.aSide = aSide;
    }

    public double getbSide() {
        return bSide;
    }

    public void setbSide(double bSide) {
        this.bSide = bSide;
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
