package ora1002;

import static java.lang.System.in;
import java.util.Scanner;

public class Ora1002 {

    private static Scanner src = new Scanner(in);
    private static String[] pakli = {};
    
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
    
    public static void kever() {
        int oszlop = 0;
        
    }

    public static int melyik(int oszlop) {
        
        while (oszlop <= 2 && oszlop >= 0) {            
            sc.nextInt();
        }
        return oszlop;
    }

    public static void kirak() {
        

    }

    public static void ezVolt() {

    }

    

}
