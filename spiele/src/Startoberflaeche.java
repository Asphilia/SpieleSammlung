package src;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Container;
import src.KlickTheButton.KTBLogik;
import src.ZeichenKreis.ZKLogik;

public class Startoberflaeche {

  public Startoberflaeche(){
    JFrame fenster = new JFrame("Asphilias Spielesammlung");
    fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //fenster.setResizable(false);
    fenster.setLocation(10,80);
    fenster.setVisible(true);
    Container con = fenster.getContentPane();
    con.setLayout(new BorderLayout());
    
    Choice spielchoice = new Choice();
    spielchoice.add("Klick the Button");
    spielchoice.add("Zeichenkreis");
    spielchoice.setLocation(100,500);
    con.add(spielchoice, BorderLayout.CENTER);
    
    JLabel welcome = new JLabel();
    welcome.setText(
    "<html><p style=\"font-family:Blackadder ITC; font-size:30px\">Willkommen!<br>Bitte wähle das Spiel!</p>"
    );
    welcome.setSize(800,300);
    welcome.setLocation(100,100);
    welcome.setVisible(true);
    con.add(welcome, BorderLayout.NORTH);

    JButton enter = new JButton("<html><p style=\"font-family: Blackadder ITC; font-size: 30px\">Spielen</p>");
    enter.setSize(100,100);
    enter.setLocation(100, 700);
    enter.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        //TODO: starte das über spielchoice ausgewählte Spiel nach druck auf enter Button
        String gewaehlt = spielchoice.getSelectedItem();
        if(gewaehlt.equalsIgnoreCase("Klick the Button")){
          KTBLogik ktbl = new KTBLogik();
        } else if(gewaehlt.equalsIgnoreCase("Zeichenkreis")){
          ZKLogik zkl = new ZKLogik();
        }
      }
    });
    enter.setEnabled(true);
    enter.setVisible(true);
    con.add(enter, BorderLayout.EAST);
    fenster.pack();
  }
}
