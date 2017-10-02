package TP2.Exo2_arbre;

/**
 * Created by ysiguman on 21/09/17.
 */

class Date {
    private int j;
    private int m;
    private int a;

    Date(int j, int m, int a) {
        this.j = j;
        this.m = m;
        this.a = a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("/");
        sb.append(m);
        sb.append("/");
        sb.append(a);
        return sb.toString();
    }
}

class Person {
    private String  name;
    private String  surName;
    private Date    birthDate;
    private Date    deathDate;
    private Person father;
    private Person mother;

    public Person(String name, String surName, Date birthDate) {
        this.name = name;
        this.surName = surName;
        this.birthDate = birthDate;
    }

    public void print(int nb) {
        System.out.println(getTab(nb) + name + " " + surName);
        System.out.println(getTab(nb) + "Né(e) le : " + birthDate.toString());
    }

    public void print() {
        System.out.println(name + " " + surName);
        System.out.println("Né(e) le : " + birthDate.toString());
    }

    public void printGenealogie(int nb) {
        this.print(nb);

        nb++;

        System.out.println(getTab(nb) + "Père:");
        if (father != null) {
            father.printGenealogie(nb);
        } else {
            System.out.println(getTab(nb) + "Non définie");
        }

        System.out.println(getTab(nb) + "Mère:");
        if (mother != null) {
            mother.printGenealogie(nb);
        } else {
            System.out.println(getTab(nb) + "Non définie");
        }
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    private String getTab(int nb) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nb; i++) {
            if (i == nb - 1) {
                sb.append("|---");
            } else {
                sb.append("|\t");
            }
        }

        return sb.toString();
    }
}
public class Exo2_arbre {
    public static void main (String[] args) {
        Date d = new Date(21, 9, 2017);
        System.out.println("Date : " + d.toString());

        System.out.println();
        System.out.println("======");
        System.out.println();

        Person victor   = new Person("victor", "duteurtre", new Date(2, 7, 1995));
        Person sam      = new Person("Sam", "Pontes", new Date(2, 7, 1995));
        Person justin   = new Person("Justin", "Duprez", new Date(2, 7, 1995));
        Person benjamin = new Person("benjamin", "Thiebo", new Date(3, 3, 1993));
        Person noel     = new Person("noel", "reboul", new Date(17,9,1995));
        Person alexis   = new Person("alexis", "Vasseur", new Date(2, 3, 1995));
        Person marie    = new Person("marie", "Pandraud", new Date(3, 2, 1995));

        victor.setFather(justin);
        victor.setMother(sam);
        justin.setFather(noel);
        justin.setMother(benjamin);
        noel.setMother(marie);
        noel.setFather(alexis);

        victor.print();

        System.out.println();
        System.out.println("======");
        System.out.println();

        victor.printGenealogie(0);
    }
}
