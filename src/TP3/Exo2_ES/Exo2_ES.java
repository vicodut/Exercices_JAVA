package TP3.Exo2_ES;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Created by ysiguman on 01/10/17.
 */
public class Exo2_ES {
    public static void main (String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("text.txt", "UTF-8");
        Scanner sc  = new Scanner(System.in);
        String line = "";
        int length  = 1;

        while (length != 0) {
            System.out.print("Ligne à écrire : ");

            line = sc.nextLine();
            writer.println(line);

            length = line.length();
        }

        writer.close();
    }
}
