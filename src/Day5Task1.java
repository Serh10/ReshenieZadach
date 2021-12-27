/**
 Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
 Создать get и set методы для каждого поля.
 Создать экземпляр класса Автомобиль.
 Задать значение для каждого поля, используя set методы.
 Вывести в консоль значение каждого из полей, используя get методы.
 Созданный вами класс должен отвечать принципам инкапсуляции.
*/

public class Day5Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Honda");
        car1.setColor("Red");
        car1.setGodVipyska(2009);
        System.out.println(car1.getModel() + ", " + car1.getColor() + ", " + car1.getGodVipyska());
    }
}

class Car1 {
    private String Model;
    private String Color;
    private int godVipyska;

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getModel() {
        return Model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getGodVipyska() {
        return godVipyska;
    }

    public void setGodVipyska(int godVipyska) {
        this.godVipyska = godVipyska;
    }
}
