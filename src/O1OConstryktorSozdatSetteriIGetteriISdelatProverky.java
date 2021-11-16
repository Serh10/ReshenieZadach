//public class O1OConstryktorSozdatSetteriIGetteriISdelatProverky {
//    public static void main(String[] args) {
//        Human chelovek1 = new Human("Петя");
//        System.out.println("Меня завут " + chelovek1.getImya() + " мне " + chelovek1.getVozrast() + " лет.");
//    }
//}
//class Human{
//    private String imya;
//    private int vozrast;
//
//    public Human(){System.out.println("Не ввели ни одного параметра");}
//
//    public Human(String imya){this.imya=imya;System.out.println("Не ввели возраст");}
//
//    public Human(String imya, int vozrast){this.imya=imya;this.vozrast=vozrast;}
//
//    public void setImya(String imya){
//        if (imya.isEmpty()){System.out.println("Вы не ввели имя");}
//        else {this.imya=imya;}}
//    public String getImya(){return imya;}
//
//    public void setVozrast(int vozrast){
//        if(vozrast<0){System.out.println("Вы ввели неправильный возраст");}
//        else {this.vozrast=vozrast;}}
//
//    public int getVozrast(){return vozrast;}
//}
