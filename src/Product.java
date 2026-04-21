package src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// 1. Создать класс "Товар" с полями: название, дата производства,
// производитель, страна происхождения, цена, состояние бронирования покупателем.
public class Product{
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
