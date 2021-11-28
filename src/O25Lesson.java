public class O25Lesson {
    public static void main(String[] args) {
        O25Animal animal = new O25Animal();
        animal.sleep();
        animal.eat();
        O25Dog dog = new O25Dog();
        dog.sleep();
        dog.eat();
        dog.bark();
        dog.showName();
    }
}
