package Exo2;

import java.util.Scanner;

/**
 * Created by ysiguman on 14/09/17.
 */
public class Exo2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int H = 0, M = 0, S = 0;

        System.out.print("Time in second : ");

        if (time >= 60*60) {
            H = time / (60*60);
            time %= 60*60;
        }

        if (time >= 60) {
            M = time / 60;
            time %= 60;
        }

        S = time;

        System.out.println(H + "  " + M + "  " + S);
    }
}
