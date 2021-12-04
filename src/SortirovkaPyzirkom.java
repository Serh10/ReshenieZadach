public class SortirovkaPyzirkom {
    public static void main(String[] args) {
            int[]num = {3,2,5,7,1,4,6,44,-5};
            boolean sorted = true;
            while (sorted){
                sorted=false;
                for (int i = 0; i< num.length-1; i++){
                    if (num[i]>num[i+1]){
                        int temp = num[i];
                        num[i] = num[i+1];
                        num[i+1] = temp;
                        sorted = true;}
                }

            }for (int y=0;y<num.length;y++){
                System.out.println(num[y]);}

        }}

