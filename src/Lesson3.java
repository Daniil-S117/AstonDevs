package src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;


public class Lesson3 {
    public static void main(String[] args) {
        // 2. Создать массив из 5 товаров.
        // Вначале объявляем массив объектов
        Product[] productsArray = new Product[5];

        // потом для каждой ячейки массива задаем объект
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.",
                "Korea", 5599, true);

        String[] namesArray = {"Apple iPhone 16 Pro Max", "Xiaomi 15 Ultra", "Huawei Pura 80 Ultra", "Google Pixel 10 Pro XL"};
        String[] datesArray = {"20.09.2024", "03.03.2025", "11.07.2025", "28.10.2026"};
        String[] manufacturerArray = {"Apple", "Xiaomi", "Huawei", "Google"};
        String[] countryArray = {"USA", "Korea", "China", "USA"};
        int[] priceArray = {8699, 4799, 6799, 7299};
        Random random = new Random();

        for (int i = 0; i < productsArray.length - 1; i++) {
            productsArray[i+1] = new Product(namesArray[i], datesArray[i], manufacturerArray[i],
                    countryArray[i], priceArray[i], random.nextBoolean());
            productsArray[i].displayInfo();
        }

        // 3
        Park centralPark = new Park("Парк развлечений Кырлай");
        Park.Attraction ferrisWheel = centralPark.new Attraction("Колесо обозрения", "09:00 - 22:00", 250);

        Park.Attraction rollerCoaster = new Park("Вокруг света").new Attraction("Американские горки", "10:00 - 21:00", 170);

        ferrisWheel.displayInfo();
        rollerCoaster.displayInfo();

    }
}
