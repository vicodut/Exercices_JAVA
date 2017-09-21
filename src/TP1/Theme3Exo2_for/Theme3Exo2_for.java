package TP1.Theme3Exo2_for;

import java.util.Scanner;

/**
 * Created by ysiguman on 18/09/17.
 */
public class Theme3Exo2_for {

    static public void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int size    = 0;

        System.out.print("Donnez la taille du motif : ");
        size = sc.nextInt();

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
