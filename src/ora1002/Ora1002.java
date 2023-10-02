package ora1002;

import static java.lang.System.in;
import java.util.Scanner;

public class Ora1002 {

    private static Scanner src = new Scanner(in);
    private static String[] pakli = new String[22];
    
    public static void main(String[] args) {

        feltolt();
        for (int i = 0; i < 3; i++) {
            int oszlop = melyik();
            kever(oszlop);
            kirak();
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
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf(pakli[i] + " ");
        }
    }

    public static int melyik() {
        int oszlop = src.nextInt();
        do {            
            System.out.println("Kérem adja meg az oszlopot");
            oszlop = src.nextInt();
        } while (oszlop < 3 || oszlop > 1);
        
        return oszlop;
    }

    public static void kever(int oszlop) {
        String[] ujPakli = new String[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i < 7; i++) {
                    ujPakli[i] = pakli[20 - (i - 1) * 3];
                    ujPakli[i+7] = pakli[19 - (i - 1) * 3];
                    ujPakli[i+14] = pakli[21 - (i - 1) * 3];
                }
                
            case 2:
                for (int i = 0; i < 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i+7] = pakli[20 - (i - 1) * 3];
                    ujPakli[i+14] = pakli[21 - (i - 1) * 3];
                }
                
            case 3:
                for (int i = 0; i < 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i+7] = pakli[21 - (i - 1) * 3];
                    ujPakli[i+14] = pakli[20 - (i - 1) * 3];
                }
        }
    }

    public static void ezVolt() {
        
        System.out.println("Ez volt a lapja: " + pakli[11]);
    }

    

}
