package TP2.Exo1_Constructeur;



/**
 * Question 1)
 *              Object
 *                |
 *             Premiere
 *            /       \
 *        Second    Troisieme
 *                     \
 *                   Quatrieme
 *
 * Question 2)
 * Cstr première
 * ====
 * Cstr première
 * Cstr second
 * ====
 * Cstr première
 * Cstr troisieme
 * ====
 * Cstr première
 * Cstr troisieme
 * Cstr quatrieme
 *
 * Question 4)
 * Oui, le constructeur de la super classe Object
 */
class Premiere {
    Premiere () {
        System.out.println("Cstr première");
    }
}

class Second extends Premiere {
    Second (boolean b) {
        super();
        System.out.println("Cstr second");
    }
}

class Troisieme extends Premiere {
    Troisieme (int i) {
        super();
        System.out.println("Cstr troisieme");
    }
}

class Quatrieme extends Troisieme {
    Quatrieme (double d) {
        super(14);
        System.out.println("Cstr quatrieme");
    }
}

public class Exo1_Constructeur {
    public static void main (String[] args) {
        new Premiere();
        System.out.println("==========");
        new Second( true );
        System.out.println("==========");
        new Troisieme(15);
        System.out.println("==========");
        new Quatrieme(12.3);
    }
}
