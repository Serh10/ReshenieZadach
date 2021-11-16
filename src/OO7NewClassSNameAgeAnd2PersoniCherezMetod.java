public class OO7NewClassSNameAgeAnd2PersoniCherezMetod {
    public static void main(String[] args) {
        NameAndAge pers1 = new NameAndAge();
        pers1.name = "Роман";
        pers1.age = 20;
        NameAndAge pers2 = new NameAndAge();
        pers2.name = "Дарья";
        pers2.age = 25;
        pers1.speak();
        pers2.speak();
    }
}
class NameAndAge {
    String name;
    int age;
    void speak(){
        System.out.println("Меня завут " + name + ", мне "+ age + " лет.");}
}
