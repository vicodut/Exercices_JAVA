package Exo1;

import java.util.Scanner;

/**
 * Created by ysiguman on 14/09/17.
 */
public class Exo1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        double temp = 0.0, tempC;

        System.out.print("Entree une température : ");
        temp = sc.nextDouble();

        tempC = (5.0/9.0) * (temp - 32.0);
        System.out.println("Température en degrée: " + tempC);

    }
}
