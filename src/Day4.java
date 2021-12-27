import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int chislo = scanner.nextInt();
        int[] numbers = new int[chislo];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }
        int bolshe8 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 8) {
                bolshe8 = bolshe8 + 1;
            }
        }
        int raven1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                raven1 = raven1 + 1;
            }
        }
        int chet = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                chet = chet + 1;
            }
        }
        int nechet = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                nechet = nechet + 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Длинна масива: " + chislo);
        System.out.println("Больше восьми: " + bolshe8);
        System.out.println("Чисел равных едиице: " + raven1);
        System.out.println("Колличество четных чисел: " + chet);
        System.out.println("Колличество нечетных чисел: " + nechet);
        System.out.println("Сумма всех элементов: " + sum);
    }
}
