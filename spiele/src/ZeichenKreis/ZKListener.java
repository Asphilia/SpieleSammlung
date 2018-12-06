package src.ZeichenKreis;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class ZKListener implements ActionListener{
    ZKOberflaeche zkl;

    public ZKListener(ZKOberflaeche zkl){
        this.zkl = zkl;
    }

    public void actionPerformed(ActionEvent e){
        //TODO: funktioniert!
        JButton gedrückt = (JButton) e.getSource();
        int s = zkl.zklogik.liste.size();
        Character last = zkl.zklogik.liste.get(s-1);
        String letztes = last.toString();
        if(gedrückt.getText().compareTo(letztes) == 0){
            zkl.beenden();
        } else {
            zkl.wort += gedrückt.getText();
        }
        gedrückt.setEnabled(false);
    }
}
