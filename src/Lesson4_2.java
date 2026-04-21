package src;

public class Lesson4_2 {
    public static void main(String[] args) {
        // Задать для каждой фигуры цвет заливки и цвет границы.
        Figure circle = new Circle(5, "Красный", "Черный");
        Figure rect = new Rectangle(10, 20, "Белый", "Синий");
        Figure triangle = new Triangle(3, 4, 5, "Желтый", "Фиолетовый");

        Figure[] figures = {circle, rect, triangle};

        // Результат полученных характеристик по каждой фигуре выводиться в консоль.
        for (Figure figure : figures) {
            figure.printInfo();
        }
    }
}
