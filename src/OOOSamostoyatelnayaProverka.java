public class OOOSamostoyatelnayaProverka {
    public static void main(String[] args) {
        int [] pyzirki = {99, 3,5,2,4,1};
//        int szetchik;
//        do {
//            szetchik=0;
//
//        for (int i = 0; i< pyzirki.length-1;i++){
//                if(pyzirki[i]>pyzirki[i+1]) {
//                    int temp = pyzirki[i];
//                    pyzirki[i] = pyzirki[i + 1];
//                    pyzirki[i + 1] = temp;
//                    szetchik++;
//
//                }        }}
//    while (szetchik > 0);
//
//    for (int j = 0; j<pyzirki.length;j++){
//        System.out.print(pyzirki[j]);}
//}}



//                for (int skolkoraz= pyzirki.length-1; skolkoraz>=0; skolkoraz--){
//            for(int sravnenie = 0; sravnenie<skolkoraz; sravnenie++){
//                if (pyzirki[sravnenie]> pyzirki[sravnenie+1]){
//                    int temp = pyzirki[sravnenie];
//                    pyzirki[sravnenie] = pyzirki[sravnenie+1];
//                    pyzirki[sravnenie+1] = temp;
//                }
//            }for (int i = 0; i< pyzirki.length;i++){
//
//                System.out.print(pyzirki[i]);}System.out.println();}}}



        for (int skolkoraz = 1; skolkoraz < pyzirki.length; skolkoraz++){
            for (int sravnenie = 1; sravnenie < pyzirki.length; sravnenie++){
                if (pyzirki[sravnenie] < pyzirki[sravnenie-1]){
                int temp = pyzirki[sravnenie];
                pyzirki[sravnenie] = pyzirki[sravnenie-1];
                pyzirki[sravnenie-1] = temp;

            }}}
            for (int i = 0; i< pyzirki.length;i++){

                System.out.print(pyzirki[i]);
                System.out.print(" ");}}}
//
//    for (int i = 0; i< pyzirki.length;i++){
//        System.out.print(pyzirki[i]);}}}










