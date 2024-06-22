package task2;
public class Triangle implements TriangleInfo {
    public double aSide;
    public double bSide;
    public double cSide;
    private double perimeter;
    private double area;
    public Color areaColor = Color.RED;
    public Color borderColor = Color.BLUE;

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
        countTrianglePerimeter();
        countTriangleArea();
    }

    @Override
    public void countTrianglePerimeter() {
        perimeter = calculateTrianglePerimeter(aSide, bSide, cSide);
    }

    @Override
    public void countTriangleArea() {
        area = calculateTriangleArea(aSide, bSide, cSide);
    }
    public void showInfo() {
        System.out.println("\nПериметр треугольника = " + perimeter +
                "\nПлощадь треугольника = " + area +
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

    public double getcSide() {
        return cSide;
    }

    public void setcSide(double cSide) {
        this.cSide = cSide;
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
