package Exo3;

import java.util.Scanner;

/**
 * Created by ysiguman on 14/09/17.
 */
public class Exo3 {
    public static void main(String[] args) {
        int r1 = 0, r2 = 0;
        int x = 0, y = 0;
        int dist = 0;
        Scanner sc = new Scanner (System.in);

        System.out.print("Rayon 1 : ");
        r1 = sc.nextInt();

        System.out.print("Rayon 2 : ");
        r2 = sc.nextInt();

        System.out.print("X : ");
        x = sc.nextInt();

        System.out.print("Y : ");
        y = sc.nextInt();

        dist = (x*x) + (y*y);

        if (dist < (r1 > r2 ? r1*r1 : r2*r2) && dist > (r1 < r2 ? r1*r1 : r2*r2)) {
            System.out.println("Le point est compris dans la couronne");
        } else {
            System.out.println("Le point n'est pas compris dans la couronne");
        }
    }

}
