import java.util.Arrays;
import java.util.Random;

//        Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//        Затем, используя цикл for each вывести в консоль:
//        наибольший элемент массива
//        наименьший элемент массива
//        количество элементов массива, оканчивающихся на 0
//        сумму элементов массива, оканчивающихся на 0
//
//        Использовать сортировку запрещено.


public class day2Task2 {
    public static void main(String[] args) {
        int[] arrays = new int[100];
        Random random = new Random();
        for (int i = 0; i< arrays.length; i++){
            arrays[i]= random.nextInt(10000);
        }
        int naib = 0;
        for (int i=0;i< arrays.length;i++){
            if (naib<arrays[i]){
                naib=arrays[i];
            }
        }
        int naim = 10000;
        for (int i=0;i< arrays.length;i++){
            if (naim>arrays[i]){
                naim=arrays[i];
            }
        }
        int okon0=0;
        int sum0=0;
        for (int i = 0; i<arrays.length;i++){
            if (arrays[i]%10==0){
                okon0++;
                sum0=sum0+arrays[i];
            }
        }

        System.out.println(Arrays.toString(arrays));
        System.out.println(naib);
        System.out.println(naim);
        System.out.println(okon0);
        System.out.println(sum0);
    }
}
