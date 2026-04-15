import java.util.Scanner;


public class AstonLesson {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
    }
    static void printThreeWords()    {
        String[] arr = {"Orange", "Banana", "Apple"};
        for (String s : arr) {
            System.out.println(s);
        }
    }
    static void checkSumSign() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a + b > 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }
}