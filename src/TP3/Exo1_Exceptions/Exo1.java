package TP3.Exo1_Exceptions;

import java.util.Scanner;

/**
 * Created by ysiguman on 01/10/17.
 */
class Exo1 {
    static int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};

    private static int division(int indice, int diviseur) {return tableau[indice - 1]/diviseur;}
    
    public static void main(String[] args){
        int x = 0, y = 0;
        Scanner sc = new Scanner(System.in);

        while (x < 1 || x > tableau.length) {
            System.out.println("Entrez l’indice de l’entier à diviser : ");
            x = sc.nextInt();
        }

        while (y == 0) {
            System.out.println("Entrez le diviseur ( != 0 ) : ");
            y = sc.nextInt();
        }

        System.out.println("Le résultat de la division est: "+division(x,y));
    }
}