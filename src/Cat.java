package src;

// Создать классы Собака и Кот с наследованием от класса Животное.
public class Cat extends Animal{

    private static int catCount = 0;
    private boolean isFull = false; // Сытость

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public int eat(int plate, int appetite) {
        if (plate >= appetite) {
            isFull = true;
            System.out.println(name + " поел и теперь сыт.");
            return plate - appetite;
        } else {
            System.out.println(name + "у не хватило еды.");
            return plate;
        }
    }

    // У каждого животного есть ограничения на действи
    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать такую дистанцию.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }

    public boolean showStatus() {
        System.out.println(name + " сытость: " + isFull);
        return isFull;
    }

    // Подсчет созданных котов.
    public static int getCatCount() {
        return catCount;
    }
}
