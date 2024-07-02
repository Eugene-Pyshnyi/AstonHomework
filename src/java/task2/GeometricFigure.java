package task2;

import task2.interfaces.Area;
import task2.interfaces.Perimeter;

public abstract class GeometricFigure implements Perimeter, Area {
    protected Color borderColor;
    protected Color areaColor;

    public GeometricFigure(Color borderColor, Color areaColor) {
        this.borderColor = borderColor;
        this.areaColor = areaColor;
    }

    @Override
    public abstract double area();

    @Override
    public abstract double perimeter();
}
