package src;

import java.util.Arrays;
import java.util.Scanner;


public class Lesson2 {
    public static void main(String[] args) {

        // 1
        printThreeWords1();
        // 2
        checkSumSign2();
        // 3
        printColor3();
        // 4
        compareNumbers4();

        // Ввод переменных с консоли
        Scanner sc = new Scanner(System.in);
        System.out.print("\nСледующие методы\nВведите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        System.out.print("Введите текст: ");
        sc.nextLine();
        String str = sc.nextLine();
        System.out.print("Введите год: ");
        int year = sc.nextInt();

        // 5
        if (checkSumBetweenTenTwelve5(a, b))
            System.out.println("Сумма лежит в пределах от 10 до 20 (включительно)");
        else
            System.out.println("Сумма не лежит в пределах от 10 до 20 (включительно)");

        // 6
        checkNumberSign6(a);

        // 7
        if (checkNumberNegative7(b))
            System.out.println("Отрицательное");
        else
            System.out.println("Положительное");

        // 8
        printMultipleTimes8(str, a);

        // 9
        if (isLeapYear9(year))
            System.out.println("Високосный");
        else
            System.out.println("Не високосный");

        // 10
        invertArray10();
        // 11
        fillArray11();
        // 12
        multiplySmallNumbers12();
        // 13
        fillArrayDiagonals13();
        // 14
        System.out.println(Arrays.toString(createArray14(a, b)));
    }


    public static void printThreeWords1()    {
        System.out.println("\nprintThreeWords1: ");

        String[] arr = {"Orange", "Banana", "Apple"};
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void checkSumSign2() {
        int a = 4, b = 12;
        System.out.println("\ncheckSumSign2: " + a + ", " + b);
        if (a + b > 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    public static void printColor3(){
        int value = 111;
        System.out.println("\nprintColor3: " + value);

        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <= 100)
            System.out.println("Желтый");
        else if (value > 100)
            System.out.println("Зеленый");
        }


    public static void compareNumbers4() {
        int a = -14, b = 75;
        System.out.println("\ncompareNumbers4: " + a + ", " + b);

        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    public static boolean checkSumBetweenTenTwelve5(int a, int b) {
        System.out.println("\ncheckSumBetweenTenTwelve5: " + a + ", " + b);
        return 10 <= a + b && a + b <= 20;
    }

    public static void checkNumberSign6(int value) {
        System.out.println("\ncheckNumberSign6: " + value);
        if (value >= 0)
            System.out.println("Положительное");
        else
            System.out.println("Отрицательное");
    }

    public static boolean checkNumberNegative7(int value) {
        System.out.println("\ncheckNumberNegative7: " + value);
        return value < 0;
    }

    public static void printMultipleTimes8(String str, int count) {
        System.out.println("\nprintMultipleTimes8: " + str + " " + Math.abs(count));
        for (int i = 0; i < Math.abs(count); i++)
            System.out.println(str);
    }

    public static boolean isLeapYear9(int year) {
        System.out.println("\nisLeapYear9: " + year);
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void invertArray10() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("\ninvertArray10: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++)
            arr[i] = 1 - arr[i];
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray11() {
        System.out.println("\nfillArray11: ");
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;
        System.out.println(Arrays.toString(arr));
    }

    public static void multiplySmallNumbers12() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("\nmultiplySmallNumbers12: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArrayDiagonals13() {
        System.out.println("\nfillArrayDiagonals13: ");
        int size = 7;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(matrix[i][j] + " ");

            System.out.println();
        }
    }

    public static int[] createArray14(int len, int initialValue) {
        System.out.println("\ncreateArray14: " + Math.abs(len) + " " + initialValue);
        int[] arr = new int[Math.abs(len)];
        Arrays.fill(arr, initialValue);

        return arr;
    }
}