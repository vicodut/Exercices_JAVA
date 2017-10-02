package TP3.Exo3_IHM1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by ysiguman on 01/10/17.
 */
public class Fenetre extends JFrame {
    private JLabel label;
    private int click;

    private void setLabel() {
        label.setText("Click here" + (click == 0 ? "" : "(" + click + ")"));
    }

    public Fenetre() {
        this.setTitle("Salut :)");
        setSize(300,100);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        label = new JLabel("Click here ;)");

        panel.add(label);

        this.setContentPane(panel);
        this.addMouseListener(new clickMouseListen());

        this.setVisible(true);
    }

    public class clickMouseListen implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            click++;
            setLabel();
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
