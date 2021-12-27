/**Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”.
 * Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
 * Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
 * Вывести в консоль значение каждого из полей, используя get методы.
*/
public class Day5Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1= new Motorbike("Honda", "Green", 2009);
        System.out.println(motorbike1.getModel()+ "\n" + motorbike1.getColor() + "\n" + motorbike1.getYearVipyska());
    }
}
class Motorbike{
    public Motorbike(String model, String color, int yearVipyska){this.model=model; this.color=color; this.yearVipyska=yearVipyska;}
    private String model;
    private String color;
    private int yearVipyska;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearVipyska() {
        return yearVipyska;
    }
}
