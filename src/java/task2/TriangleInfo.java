package task2;

public interface TriangleInfo {
    void countTrianglePerimeter();
    void countTriangleArea();
    default double calculateTrianglePerimeter(double aSide, double bSide, double cSide) {
        return aSide + bSide + cSide;
    }
    default double calculateTriangleArea(double aSide, double bSide, double cSide) {
        double p = calculateTrianglePerimeter(aSide, bSide, cSide) /2;
        return Math.sqrt(p * (p-aSide) * (p - bSide) * (p - cSide));
    }
}
