package TP2.Exo3_Mari;

/**
 * Created by ysiguman on 21/09/17.
 */
public class Person {
    private String  name;
    private int     age;
    private boolean sexe;
    private Person  conjoint;

    public Person(String name, int age, boolean sexe) {
        this.name   = name;
        this.age    = age;
        this.sexe   = sexe;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getSexe() {
        return sexe;
    }

    public Person getConjoint() {
        return conjoint;
    }

    public void setConjoint(Person conjoint) {
        this.conjoint = conjoint;
    }

    public boolean marryWith (Person conjoint) {
        try {
            if (this.conjoint != null || this.age < 18 || conjoint.getAge() < 18 ||
                    conjoint.getConjoint() != null || this == conjoint || this.sexe == conjoint.getSexe()) {
                throw new PersonException("Les personnes ne peuvent se marrier");
            }

            this.conjoint = conjoint;
            conjoint.setConjoint(this);

            System.out.println(this.name + " et " + conjoint.getName() + " viennent de se marrier.");

            return true;
        } catch (PersonException e) {
            return false;
        }
    }

    public boolean divorce () {
        try {

            if (this.conjoint != null) {
                System.out.println(this.name + " et " + conjoint.getName() + " viennent de se divorcer.");

                this.conjoint.setConjoint(null);
                this.conjoint = null;

                return true;
            }

            throw new PersonException(this.name + " n'est pas marrié.");
        } catch (PersonException e) {
            return false;
        }
    }
}
