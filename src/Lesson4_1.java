package src;

public class Lesson4_1{
    public static void main(String[] args) {

        Dog dogBobik = new Dog("Бобик");

        // Создаем массив котов
        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Рыжик"),
                new Cat("Мурзик")
        };

        // Проверка бега и плавания
        dogBobik.run(150);
        dogBobik.swim(150);

        cats[0].run(100);
        cats[1].swim(5);

        int plate = 30; // В миске 30 единиц еды

        // Коты едят
        System.out.println("\n--- Время обеда ---");
        for (int i = 0; i < cats.length; i++) {
            plate = cats[i].eat(plate, 15); // Каждый кот хочет съесть 15
            if (!cats[i].showStatus()) {
                // Пополняем миску и кормим оставшихся
                plate = addFood(plate, 20);
                i = i - 1;
            }
        }

        // Статистика
        System.out.println("\n--- Статистика ---");
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего животных: " + Animal.getTotalAnimals());
    }

    public static int addFood(int plate, int food){
        System.out.println("\nПополнее миски едой");
        return plate + food;
    }
}
