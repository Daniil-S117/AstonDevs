package src;

// Создать класс Животное.
public abstract class Animal {

    protected String name;
    private static int totalAnimals = 0;

    public Animal(String name) {
        this.name = name;
        totalAnimals++;
    }

    // Все животные могут бежать и плыть
    public abstract void run(int distance);
    public abstract void swim(int distance);

    // Подсчет созданных животных
    public static int getTotalAnimals() {
        return totalAnimals;
    }
}