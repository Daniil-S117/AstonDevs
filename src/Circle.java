package src;

public class Circle implements Figure {
    private double radius;
    private String fillColor, borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getName() { return "Круг"; }

    @Override
    public double[] getSides() {
        // Для круга "сумма сторон" — это и есть длина окружности
        return new double[]{2 * Math.PI * radius};
    }

//    @Override
//    public double getPerimeter() { return 2 * Math.PI * radius; }

    @Override
    public double getArea() { return Math.PI * radius * radius; }

    @Override
    public String getFillColor() { return fillColor; }

    @Override
    public String getBorderColor() { return borderColor; }
}