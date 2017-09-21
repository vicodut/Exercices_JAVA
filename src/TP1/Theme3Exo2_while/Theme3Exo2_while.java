package TP1.Theme3Exo2_while;

import java.util.Scanner;

/**
 * Created by ysiguman on 18/09/17.
 */
public class Theme3Exo2_while {

    static public void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int size    = 0;
        int i       = 0;
        int j       = 0;

        System.out.print("Donnez la taille du motif : ");
        size = sc.nextInt();

        while (i <= size) {
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();

            j = 0;
            i++;
        }
    }
}
