import java.util.Scanner;

public class Day2Task2 {
    public static void main(String[] args) {
        Scanner nuu = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = nuu.nextInt();
        System.out.print("Введите число b: ");
        int b = nuu.nextInt();
        if (a > b) {
            System.out.println("Неккоректный ввод");
        }
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }
        }
    }
}
