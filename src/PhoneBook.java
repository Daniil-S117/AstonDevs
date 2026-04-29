package src;

import java.util.*;

// Простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
public class PhoneBook {
    private Map<String, Set<String>> book = new HashMap<>();

    // С помощью метода add() можно добавлять записи
    public void add(String surname, String phoneNumbers){
        book.computeIfAbsent(surname, k -> new HashSet<>()).add(phoneNumbers);
    }

    // С помощью метода get() искать номер телефона по фамилии
    public void get(String surname){
        if (book.containsKey(surname)){
            System.out.println("\n" + surname + ": " + book.get(surname));
        } else {
            System.out.println("\nЗаписи по фамилии '" + surname + "' не найдена.");
        }
    }
}