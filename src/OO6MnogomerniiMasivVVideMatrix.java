public class OO6MnogomerniiMasivVVideMatrix {
    public static void main(String[] args) {
        int[][] mnogomerMassiv = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < mnogomerMassiv.length; i++) {
            for (int y = 0; y < mnogomerMassiv[i].length; y++) {
                System.out.print(mnogomerMassiv[i][y]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
