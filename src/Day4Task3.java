
//        Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
//        В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких строк несколько, вывести индекс последней из них.
//        Пример сгенерированной матрицы (для простоты m=3, n=5):
//
//        3 2 1 5 7     // сумма - 18
//        1 2 5 6 2     // сумма - 16
//        3 4 9 6 4    // сумма - 26
//
//        Ответ: 2 (индекс строки, сумма чисел в которой максимальна)

import java.util.Random;

public class Day4Task3 {
    public static void main(String[] args) {


        int[][] arrays = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            for (int y = 0; y < arrays[i].length; y++) {
                arrays[i][y] = random.nextInt(50);
            }
        }
//        int[][] matrix = {{3, 2, 1, 5, 7},
//                {1, 2, 5, 6, 2},
//                {3, 4, 9, 6, 4}

        int indeks = 0;
        int summa = 0;
        for (int i = 0; i < arrays.length; i++) {
            int ssum = 0;
            for (int y = 0; y < arrays[i].length; y++) {
                ssum = ssum + arrays[i][y];
                if (summa <= ssum) {
                    summa = ssum;
                    indeks = i;
                }
            }
            System.out.println(ssum);
        }
        System.out.println(summa);
        System.out.println(indeks);
    }
}