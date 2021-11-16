public class O11Static {
    public static void main(String[] args) {
        Human.deskr = "Досвидание.";
        Human chelovek1 = new Human("Петя", 45);
        System.out.println("Меня завут " + chelovek1.getImya() + " мне " + chelovek1.getVozrast() + " лет. " + Human.deskr);
        chelovek1.kollichestvoChelovek();
        System.out.println("Число PI = " + Math.PI);}}



class Human{
    private String imya;
    private int vozrast;
    private static int kollichestvoSotrydnikov;

    public static String deskr;

    public Human(String imya, int vozrast){this.imya=imya;this.vozrast=vozrast;kollichestvoSotrydnikov++;}

    public void setImya(String imya){
        if (imya.isEmpty()){System.out.println("Вы не ввели имя");}
        else {this.imya=imya;}}
    public String getImya(){return imya;}

    public void setVozrast(int vozrast){
        if(vozrast<0){System.out.println("Вы ввели неправильный возраст");}
        else {this.vozrast=vozrast;}}

    public int getVozrast(){return vozrast;}

    public void kollichestvoChelovek(){System.out.println("Всего сотрудников "+ kollichestvoSotrydnikov + " человек");}
}
