package src;

public class Triangle implements Figure {
    private double a, b, c;
    private String fillColor, borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getName() { return "Треугольник"; }

    @Override
    public double[] getSides() {
        return new double[]{a, b, c}; // Три стороны
    }

//    @Override
//    public double getPerimeter() { return a + b + c; }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Формула Герона
    }

    @Override
    public String getFillColor() { return fillColor; }

    @Override
    public String getBorderColor() { return borderColor; }
}