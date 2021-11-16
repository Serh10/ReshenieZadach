public class OO8NewClassSNameAgeAnd2PersoniCherezMetodSPensiei {
    public static void main(String[] args) {
        NameAndAge1 perss1 = new NameAndAge1();
        perss1.namee = "Роман";
        perss1.agee = 20;
        NameAndAge1 perss2 = new NameAndAge1();
        perss2.namee = "Дарья";
        perss2.agee = 25;
        perss1.speak();
        perss2.speak();
    }
}
class NameAndAge1 {
    String namee;
    int agee;
    int doPensii(){
        int doPensi = 65 - agee;
        return doPensi;
    }
    void speak(){
        System.out.println("Меня завут " + namee + ", мне "+ agee + " лет. До пенсии " + doPensii() + " лет.");}
}
