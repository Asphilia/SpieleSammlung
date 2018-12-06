package src.ZeichenKreis;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.ArrayList;

public class ZKOberflaeche {
    private JFrame fenster;
    private JButton[] kreis;
    private JLabel header;

    public ZKOberflaeche(ArrayList<Character> chars){
        fenster = new JFrame("Asphilias Zeichenkreis");
        fenster.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fenster.setLayout(null);
        fenster.setBounds(75,75,1000,1000);
        //fenster.setVisible(true);

        header = new JLabel();
        header.setText("Du bist in Level 1.");
        header.setSize(1000,50);
        header.setLocation(0,50);
        fenster.add(header);

        System.out.println(chars.size());
        kreisErstellen(chars);
    }

    public void kreisErstellen(ArrayList<Character> chars){
        int groesse = chars.size();
        kreis = new JButton[groesse];
        ArrayList<Character> liste = mischeListe(chars);

        for(int i = 0; i<groesse; i++){
            kreis[i] = new JButton();
            kreis[i].setText(""+liste.get(i).charValue());
            kreis[i].setSize(50,50);
            int x = (int) (Math.sin(2*Math.PI/groesse*i)*900+450);
            int y = (int) (Math.cos(2*Math.PI/groesse*i)*900+400);
            kreis[i].setLocation(x,y);
            kreis[i].setEnabled(true);
            //kreis[i].addActionListener(zkl);
            fenster.add(kreis[i]);
        }
        fenster.setVisible(true);
    }

    private ArrayList<Character> mischeListe(ArrayList<Character> chars){
        ArrayList<Character> liste = chars;

        for(int i = 0; i<3; i++){
            for(int k = 0; k<liste.size(); k++){
                int dorthin = (int) (Math.random()*liste.size());
                Character temp = liste.get(dorthin);
                Character tauschen = liste.get(k);
                liste.set(dorthin, tauschen);
                liste.set(k, temp);
            }
        }

        return liste;
    }
}
