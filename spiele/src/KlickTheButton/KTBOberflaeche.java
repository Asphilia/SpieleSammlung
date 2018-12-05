package src.KlickTheButton;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.Container;

public class KTBOberflaeche {
    JButton button;
    JFrame fenster;

    public KTBOberflaeche(KTBLogik logik){
        fenster = new JFrame("Asphilias Klick the Button Game");
        fenster.setResizable(false);
        fenster.setLayout(null);
        fenster.setBounds(100, 80, 1000, 1000);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
        Container con = fenster.getContentPane();
        con.setLayout(new BorderLayout());
        con.add(gewonnen, BorderLayout.CENTER);
        fenster.pack();
    }
}
