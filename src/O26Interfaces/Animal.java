package O26Interfaces;

public class Animal implements Info{
    public int id;
    public Animal(int id){this.id=id;}
    public void sleep(){
        System.out.println("Я сплю");
    }

    public void showInfo() {
        System.out.println("Этот ID = " + this.id);

    }
}
