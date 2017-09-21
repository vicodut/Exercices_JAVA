package TP1.Theme3Exo4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ysiguman on 21/09/17.
 */
public class Theme3Exo4 {
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int limit   = 0;
        List<Integer> fibonacci = new ArrayList<>();

        System.out.print("Donnez la limite : ");
        limit = sc.nextInt();

        fibonacci.add(1);
        fibonacci.add(2);

        limit -= 2;

        while (limit-- > 0) {
            fibonacci.add(fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2));
        }

        System.out.println("Nieme : " + fibonacci.get(fibonacci.size() - 1));
    }
}