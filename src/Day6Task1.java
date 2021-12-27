/**
 * Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня в пакет текущего дня.
 * В классах Автомобиль и Мотоцикл реализуйте два метода:
 * void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год)
 * и возвращает разницу между переданным годом и годом выпуска транспортного средства (возвращаться должно всегда положительное число).
 * В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.
 */
public class Day6Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Honda");
        car1.setColor("Red");
        car1.setGodVipyska(2009);
        System.out.println(car1.getModel() + ", " + car1.getColor() + ", " + car1.getGodVipyska());
        car1.info();
        System.out.println(car1.yearDifference(2013));
    }
}

class Car {
    private String Model;
    private String Color;
    private int godVipyska;

    public int yearDifference(int inputYear) {
        return (Math.abs(godVipyska - inputYear));

    }

    public void info() {
        System.out.println("Это автомобиль");
    }

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

