package src.KlickTheButton;

import java.awt.Frame;
import javax.swing.JButton;
import java.awt.Label;

public class KTBOberflaeche {
    JButton button;
    Frame fenster;

    public KTBOberflaeche(KTBLogik logik){
        fenster = new Frame("Asphilias Klick the Button Game");
        fenster.setResizable(false);
        fenster.setLayout(null);
        fenster.setBounds(100, 50, 1000, 1000);
        fenster.setVisible(true);

        button = new JButton("Klick Mich!");
        button.setSize(100,50);
        button.setEnabled(true);
        button.setLocation(100,100);
        button.addActionListener(logik);
        button.addMouseListener(logik);
        fenster.add(button);
    }

    public void gewonnen(){
        button.setVisible(false);
        button.setEnabled(false);

        Label gewonnen = new Label();
        gewonnen.setText("Gratulation! Du hast gewonnen!");
        gewonnen.setSize(1000,1000);
        gewonnen.setLocation(0,0);
        gewonnen.setVisible(true);
        fenster.add(gewonnen);
    }
}
