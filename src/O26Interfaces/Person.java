package O26Interfaces;

public class Person implements Info{
    public String name;
    public Person(String name) {this.name = name;}
    public void sayHello(){
        System.out.println("Привет");
    }

    @Override
    public void showInfo() {
        System.out.println("Имя " + this.name);

    }
}
