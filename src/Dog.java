package src;

// Создать классы Собака и Кот с наследованием от класса Животное.
public class Dog extends Animal {

    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    // У каждого животного есть ограничения на действи
    @Override
    public void run(int distance) {
        if (distance <= 500)
            System.out.println(name + " пробежал " + distance + " м.");
        else
            System.out.println(name + " не может пробежать такую дистанцию.");

    }

    @Override
    public void swim(int distance) {
        if (distance <= 10)
            System.out.println(name + " проплыл " + distance + " м.");
        else
            System.out.println(name + " не может проплыть такую дистанцию.");
    }

    // Подсчет созданных собак.
    public static int getDogCount() {
        return dogCount;
    }
}
