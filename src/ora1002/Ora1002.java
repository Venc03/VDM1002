package ora1002;

import static java.lang.System.in;
import java.util.Scanner;

public class Ora1002 {

    private static Scanner src = new Scanner(in);
    private static String[] pakli = new String[22];
    
    public static void main(String[] args) {

        feltolt();
        for (int i = 0; i < 3; i++) {
            melyik();
            kirak();
            kever();
        }
        ezVolt();

    }

    public static void feltolt() {
        String[] ertek = {"K", "Q", "J", "X", "IX", "VIII"};
        String[] szinek = {"P", "M", "Sz", "L"};
        
        for(String szin : szinek){
            int x = 0;
            for (int i = 1; i < 22 && x < ertek.length; i++) {
                pakli[i] = szin + "_" + ertek[x];
               
            }
        }
        
    }
    
    public static void kirak() {
        for (int i = 0; i < pakli.length; i++) {
            System.out.printf(pakli[i] + "d8%");
        }
    }

    public static int melyik() {
        int oszlop = 0;
        while (oszlop <= 2 && oszlop >= 0) {  
            System.out.println("Kérem adja meg az oszlopot");
            oszlop = src.nextInt();
        }
        return oszlop;
    }

    public static void kever(int oszlop) {
        String[] ujPakli = new String[22];
        for (int i = 1; i < 10; i++) {
            
        }
        switch (oszlop) {
            case 1:
                ujPakli[i] = (20 - (i - 1) * 3);
                ujPakli[i+7] = (19 - (i - 1) * 3);
                ujPakli[i+14] = (21 - (i - 1) * 3);
                
            case 2:
                ujPakli[i] = (19 - (i - 1) * 3);
                ujPakli[i+7] = (20 - (i - 1) * 3);
                ujPakli[i+14] = (21 - (i - 1) * 3);
                
            case 3:
                ujPakli[i] = (19 - (i - 1) * 3);
                ujPakli[i+7] = (21 - (i - 1) * 3);
                ujPakli[i+14] = (20 - (i - 1) * 3);
        }
    }

    public static void ezVolt() {

    }

    

}
