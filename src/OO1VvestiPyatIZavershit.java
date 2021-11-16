import java.util.Scanner;

public class OO1VvestiPyatIZavershit {
            public static void main(String[] args) {
            Scanner chislo = new Scanner(System.in);
            int chislo1;
            System.out.println("Введите 5");
            do {
                chislo1 = chislo.nextInt();
                if(chislo1==5){break;}
                System.out.println("Вы ввели " + chislo1+ ". Введите 5");}
            while (chislo1 !=5);
            System.out.println("Ура Вы ввели 5");
        }
}
