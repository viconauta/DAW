/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabra.al.reves;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class PalabraAlReves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca una palabra de 5 letras:");
            String palabra = sc.nextLine();
            int var1 = palabra.charAt(0);
            int var2 = palabra.charAt(1);
            int var3 = palabra.charAt(2);
            int var4 = palabra.charAt(3);
            int var5 = palabra.charAt(4);
            
            System.out.println("" + palabra.charAt (4) + palabra.charAt (3) + palabra.charAt (2) + palabra.charAt (1) + palabra.charAt (0));
             
            
       
    }
    
}
