import java.util.Scanner;

public class Theme2Exo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir 1er nombre");
        double x= sc.nextDouble();
        System.out.println("Veuillez saisir 2em nombre");
        double y= sc.nextDouble();
        System.out.println("Veuillez saisir 3em nombre");
        double z= sc.nextDouble();
        double temp;

        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        if ( y > z) {
            temp = y;
            y = z;
            z = temp;
        }

        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        System.out.println("ordre" + x + y + z );

    }

}