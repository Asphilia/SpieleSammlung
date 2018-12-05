import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Choice;

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
  }
}
