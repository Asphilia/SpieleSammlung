package src.ZeichenKreis;

import java.util.ArrayList;
import java.io.FileInputStream;

public class ZKLogik {
    FileInputStream fis;
    ArrayList<Character> liste;
    String ort = "C:/Users/janik/Documents/gitAsphilia/SpieleSammlung/spiele/src/ZeichenKreis/zeichenkreis.txt";

    public ZKLogik(){
        try {
            fis = new FileInputStream(ort);
        } catch (Exception e){
            System.out.println("Datei nicht gefunden...");
            System.exit(1);
        }
        liste = new ArrayList<>();
        try {
            reading();
        } catch (Exception e){
            System.out.println("Ein Fehler beim lesen der Datei...");
            try{
            fis.close();
            } catch (Exception e2){
                System.out.println("File not closeable...");
                System.exit(3);
            }

            System.exit(2);
        }

        ZKOberflaeche zko = new ZKOberflaeche(liste);
       // zko.kreisErstellen(liste);
    }

    private void reading()throws java.io.IOException{
        boolean wortende = false;
        while(!wortende){
            int next = fis.read();
            if(next == -1 ){
                wortende = true;
            } else {
                char nextc = (char) next;
                if(nextc != '\n') {
                    liste.add(new Character(nextc));
                    System.out.println(nextc);
                }else{
                    wortende = true;
                }
            }
        }
    }
}
