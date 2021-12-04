public class Coto {
    public static void main(String[] args) {
        Humann pervii = new Humann();
        pervii.setName("Vasilii");
        pervii.setVozrast(25);
        System.out.println(pervii.getName() + " " + pervii.getVozrast());
        pervii.speeak();
        Humann vtoroi = new Humann();
        vtoroi.setName("Petia");
        vtoroi.setVozrast(35);
        vtoroi.speeak();}}

class Humann {
    private int vozrast;
    private String name;
    private  static int kolvosotr = 0;
    int pensiia(){int pensii = 65 - vozrast; return pensii;}
//    public Humann(String name){this.name = name; System.out.println("два");}
//    public Humann(String name, int vozrast){this.name = name; this.vozrast = vozrast;
//        System.out.println("Три");}
    public void setName(String name){if (name.isEmpty()){System.out.println("Вы ввели пустое имя");}else this.name = name; kolvosotr++;}
    public String getName(){return name;}
    public void setVozrast(int vozrast){if (name.isEmpty()){System.out.println("Вы ввели пустой возраст");}else this.vozrast = vozrast;}
    public int getVozrast(){return vozrast;}
    void speeak (){System.out.println("Меня завут " + name + " мне " + vozrast + " лет" + " до пенсии мне еще " + pensiia() + " лет" + " всего сотрудников устроено " +
            kolvosotr);}

}