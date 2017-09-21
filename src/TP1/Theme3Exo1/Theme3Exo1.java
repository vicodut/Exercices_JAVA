package TP1.Theme3Exo1;


import java.util.*;

/**
 * Created by ysiguman on 18/09/17.
 */
public class Theme3Exo1 {
    public static void main (String[] args) {
        Scanner sc =        new Scanner(System.in);
        List<Double> notes = new ArrayList<>();
        double note_temp =  0.0;
        double min       =  0.0;
        double max       =  0.0;
        double avr       =  0.0;

        while (note_temp != -1) {
            System.out.print("donnez une note ( >=0 ou -1 pour arrêter): ");
            note_temp = sc.nextDouble();

            while (note_temp < -1) {
                System.out.print("!! >= 0 ou -1 : ");
                note_temp = sc.nextDouble();
            }

            if (note_temp != - 1) {
                notes.add(note_temp);
            }
        }

        max = Collections.min(notes);
        min = Collections.max(notes);

        notes.remove(max);
        notes.remove(min);

        System.out.println(String.format("La note la plus élevée (%.1f) et la note plus" +
                " basse (%.1f) ont été retirées", max, min));

        for (Double note : notes) {
            avr += note;
        }

        avr = notes.size() == 0 ? 0 : avr / notes.size(); // Evite un NaN

        System.out.println("La moyenne olympique est : " + avr);
    }
}
