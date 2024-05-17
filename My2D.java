import java.util.Scanner;

public class My2D {
    public static void main(String[] args) {

        int x[][]; // 2d array declaration

        int y[][] = new int[3][2];// 3:row 2:col -> 3X2 : 6
        // _ _
        // _ _
        // _ _

        /*
         * 0 1
         * 0 00 01
         * 1 10 11
         * 2 20 21
         */

        Scanner scr = new Scanner(System.in);
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.println("Enter value");
                y[i][j] = scr.nextInt();
            }
        }

        System.out.println("Data In Array");
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.print(y[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
