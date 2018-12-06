package src.KlickTheButton;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class KTBLogik implements MouseListener, ActionListener{

    KTBOberflaeche ktbo;

    public KTBLogik(){
        ktbo = new KTBOberflaeche(this);

    }

    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}


    public void mouseEntered(MouseEvent e){
        int x = (int) (Math.random()*900);
        int y = (int) (Math.random()*850+50);
        ktbo.button.setLocation(x, y);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(ktbo.button)){
            ktbo.gewonnen();
        }
    }
}