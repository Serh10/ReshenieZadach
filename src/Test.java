import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите кол-во карточек: ");
        int kolvoKartochek = num.nextInt();
        int[] kolvoBezOdnoi = new int[kolvoKartochek - 1];
        int totalSum = 0;
        int SumBezOdnoi = 0;

        for (int y = 0; y < kolvoKartochek; y++) {
            totalSum = totalSum + (y + 1);
        }

        for (int i = 0; i < kolvoKartochek - 1; i++) {
            System.out.print("Номер оставшейся карты: ");
            kolvoBezOdnoi[i] = num.nextInt();
            SumBezOdnoi = SumBezOdnoi + kolvoBezOdnoi[i];
        }
        int poteriannaya = totalSum - SumBezOdnoi;
        System.out.println("Номер потерявшейся карты: " + poteriannaya);
    }
}
