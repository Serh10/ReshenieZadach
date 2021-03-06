//Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
//Пример:
//*Для простоты пример показан на массиве размера 10
//[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
//Тройка с максимальной суммой: [8742, 1040, 3254]
//Вывод в консоль:
//13036
//7
//*Пояснение. Первое число - сумма тройки [8742, 1040, 3254]. Второе число - индекс первого элемента тройки, то есть индекс числа 8742.

import java.util.Arrays;
import java.util.Random;

public class Day4Task4 {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(10);
        }
        int summaIdx = 0;
        int indeks = 0;
        for (int i = 2; i < arrays.length; i++) {
            int sum = 0;
            sum = arrays[i - 2] + arrays[i - 1] + arrays[i];
            if (sum > summaIdx) {
                summaIdx = sum;
                indeks = i-2;
            }
            System.out.println(sum);

        }
        System.out.println();
        System.out.println(indeks);
        System.out.println(Arrays.toString(arrays));
    }
}
