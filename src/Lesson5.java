package src;

public class Lesson5 {
    public static void main(String[] args) {

        String[][] firstArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] secondArray = new String[4][5];

        String[][] thirdArray = {
                {"1", "Two", "Three", "Four"},
                {"Five", "6", "Seven", "Eight"},
                {"Nine", "Ten", "11", "Twelve"},
                {"Thirteen", "Fourteen", "Fifteen", "16"}};

        String[][][] arrays = {firstArray, secondArray, {}, thirdArray};

        for (String[][] array : arrays) {
            try {
                int result = sumConvertArray(array);
                System.out.println("Сумма элементов: " + result);
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }
        }

        // Демонстрация ArrayIndexOutOfBoundsException
        generateIndexOutOfBounds();
    }

    // Метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    public static int sumConvertArray(String[][] array)  throws MyArraySizeException, MyArrayDataException {
        // При подаче массива другого размера будет брошено исключение MyArraySizeException.
        if (array.length != 4) throw new MyArraySizeException("Количество строк не равно 4");
        for (String[] row : array) {
            if (row.length != 4) throw new MyArraySizeException("Количество столбцов в строке не равно 4");
        }

        // Метод пройдётся по всем элементам массива, преобразует их в int и просуммирует.
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    // Если в элементе массива преобразование не удалось, будет брошено исключение MyArrayDataException
                    // с детализацией, в какой именно ячейке лежат неверные данные
                    throw new MyArrayDataException(i, j); //
                }
            }
        }
        return sum;
    }

    // Метод для генерации и ловли ArrayIndexOutOfBoundsException
    public static void generateIndexOutOfBounds() {
        System.out.println("\n--- Тест выхода за границы массива ---");
        int[] simpleArray = {1, 2, 3};
        try {
            int error = simpleArray[10]; // Обращение к несуществующему индексу
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано стандартное исключение: " + e);
        }
    }
}
