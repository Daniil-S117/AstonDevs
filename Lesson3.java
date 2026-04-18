import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;


public class Lesson3 {
    // 1. Создать класс "Товар" с полями: название, дата производства,
    // производитель, страна происхождения, цена, состояние бронирования покупателем.
    public static class Product{
        private final String name;
        private final LocalDate productionDate;
        private final String manufacturer;
        private final String countryOrigin;
        private final int price;
        private final boolean reservationStatus;

        public Product(String name, String production_date, String manufacturer,
                       String country_of_origin, int price, boolean buyer_reservation_status){
            this.name = name;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            this.productionDate = LocalDate.parse(production_date, formatter);
            this.manufacturer = manufacturer;
            this.countryOrigin = country_of_origin;
            this.price = price;
            this.reservationStatus = buyer_reservation_status;
        }

        public void displayInfo(){
            System.out.println("\nНазвание: " + this.name + "\nДата производства: " + this.productionDate +
                    "\nПроизводитель: " + this.manufacturer + "\nСтрана происхождения: " + this.countryOrigin +
                    "\nЦена: " + this.price + " руб." + "\nСостояние бронирования покупателем: " + this.reservationStatus);
        }
    }


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
        Park.Attraction ferrisWheel = centralPark.new Attraction("Американские горки", "09:00 - 22:00", 250);

        Park.Attraction rollerCoaster = new Park("Вокруг света").new Attraction("Колесо обозрения", "10:00 - 21:00", 170);

        ferrisWheel.displayInfo();
        rollerCoaster.displayInfo();

    }

    // 3
    public static class Park {
        private String parkName;

        public Park(String parkName) {
            this.parkName = parkName;
        }

        public class Attraction {
            private String name;
            private String workingHours;
            private int cost;

            public Attraction(String name, String workingHours, int cost) {
                this.name = name;
                this.workingHours = workingHours;
                this.cost = cost;
            }

            public void displayInfo() {
                System.out.println("\nПарк: " + parkName + "\nАттракцион: " + name +
                        "\nВремя работы: " + workingHours + "\nСтоимость: " + cost + " руб.");
            }
        }

    }
}
