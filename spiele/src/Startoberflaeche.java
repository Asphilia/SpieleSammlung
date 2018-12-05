import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Startoberflaeche {

  public Startoberflaeche(){
    JFrame fenster = new JFrame("Asphilias Spielesammlung");
    fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenster.setLayout(null);
    fenster.setResizable(false);
    fenster.setSize(1000,1000);
    fenster.setLocation(10,50);
    fenster.setVisible(true);
    
    Choice spielchoice = new Choice();
    spielchoice.add("Klick the Button");
    spielchoice.add("Zeichenkreis");
    spielchoice.setLocation(100,500);
    fenster.add(spielchoice);
    
    JLabel welcome = new JLabel();
    welcome.setText(
    "<html><p style=\"font-family:Blackadder ITC; font-size:30px\">Willkommen!<br>Bitte wähle das Spiel!</p>"
    );
    welcome.setSize(800,300);
    welcome.setLocation(100,100);
    fenster.add(welcome);

    JButton enter = new JButton("<html><p style=\"font-family: Blackadder ITC; font-size: 30px\">Spielen</p>");
    enter.setSize(100,50);
    enter.setLocation(100, 700);
    enter.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        //TODO: starte das über spielchoice ausgewählte Spiel nach druck auf enter Button
      }
    });
    enter.setEnabled(true);
    fenster.add(enter);
  }
}
