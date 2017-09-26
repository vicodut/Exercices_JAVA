package TP2.Exo3_Mari;

/**
 * Created by ysiguman on 21/09/17.
 */
public class Exo3_Mari {
    public static void main (String[] args) {
        Person victor   = new Person("victor", 22, true);
        Person noel   = new Person("victor", 22, true);
        Person pierre   = new Person("victor", 22, false);

        victor.marryWith(noel);
        noel.marryWith(pierre);
    }
}
