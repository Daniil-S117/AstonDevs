package src;

public interface Figure {
    String getName();
    String getFillColor();
    String getBorderColor();

    // Реализация базовых методов, таких как расчет периметра и площади фигур
    double[] getSides();
    default double getPerimeter() {
        double sum = 0;
        for (double side : getSides()) {
            sum += side;
        }
        return sum;
    }
    double getArea();

    // Метод для вывода полной информации
    default void printInfo() {
        System.out.printf("Фигура: %s [%s]\n", getName(), this.getClass().getSimpleName());
        System.out.printf("Периметр: %.2f, Площадь: %.2f\n", getPerimeter(), getArea());
        System.out.printf("Цвет фона: %s, Цвет границ: %s\n", getFillColor(), getBorderColor());
        System.out.println("-----------------------------------");
    }
}
