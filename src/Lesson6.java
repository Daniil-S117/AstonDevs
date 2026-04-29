package src;

import java.util.*;

public class Lesson6 {
    public static void main (String[] args){
        // Задание 1
        // Коллекция, содержащая объекты класса Student.
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Даниил", "ТРП-1-19", 3, Arrays.asList(4, 5, 4)),
                new Student("Антон", "ИЦТЭ-1-23", 5, Arrays.asList(5, 5, 5))
        ));

        students.add(new Student("Салават", "ПИ-2-18", 2, Arrays.asList(3, 2, 2)));
        students.add(new Student("Роза", "ИВТ-1-20", 3, Arrays.asList(4, 4, 3)));
        students.add(new Student("Сергей", "ПМ-1-21", 1, Arrays.asList(3, 4, 2)));

        deleteStudents(students);

        promoteStudents(students);

        printStudents(new HashSet<>(students), 4);

        // Задание 2
        // Простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
        PhoneBook myBook = new PhoneBook();

        // С помощью метода add() можно добавлять записи
        myBook.add("Сушков", "8 950 186-77-85");
        myBook.add("Зарипов", "7-924-313-05-24");
        myBook.add("Сушков", "8(937)196-20-99"); // Однофамилец или второй номер

        // С помощью метода get() искать номер телефона по фамилии
        myBook.get("Сушков"); // Выведет оба номера
        myBook.get("Зарипов");
        myBook.get("Каримова");
    }

    // Метод, который удаляет студентов со средним баллом < 3
    public static void deleteStudents(List<Student> students){
        System.out.println("\nСледующие студенты были удалены: ");
        for (Student student : students)
            if (student.getAverageGrade() < 3) {
                System.out.println(student.getName() + " - " + student.getGroup());
                students.remove(student.getName());
            }
    }

    // Метод, который переводит студента на следующий курс, если средний балл >= 3
    public static void promoteStudents(List<Student> students){
        System.out.println("\nСледующие студенты были переведены на следующий курс: ");
        for (Student student : students)
            if (student.getAverageGrade() >= 3) {
                System.out.println(student.getName() + " - " + student.getGroup() + " -> " + student.getCourse());
                student.nextCourse();
            }
    }

    // Метод printStudents(Set<Student> students, int course), который получает список студентов и номер курса.
    // Метод печатает на консоль имена тех студентов, которые обучаются на данном курсе.
    public static void printStudents(Set<Student> students, int course){
        System.out.println("\nСтуденты " + course + " курса");
        for (Student student : students)
            if (student.getCourse() == course)
                System.out.println(student.getName());
    }
}
