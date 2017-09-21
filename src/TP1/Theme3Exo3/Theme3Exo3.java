package TP1.Theme3Exo3;

import java.util.Scanner;

/**
 * Created by ysiguman on 21/09/17.
 */
public class Theme3Exo3 {
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int size    = 0;

        System.out.print("Donnez la taille du motif : ");
        size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size * 2; j++) {
                if (j >= (size - i) && j <= (size + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
