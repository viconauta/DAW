/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabras.a.color.pkg1;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class PalabrasAColor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a escribir 5 palabras:");
        String pal = sc.nextLine();
        String pal2 = sc.nextLine();
        String pal3 = sc.nextLine();
        String pal4 = sc.nextLine();
        String pal5 = sc.nextLine();
        System.out.println("\u001B[32m" + pal);
        System.out.println("\u001B[34m" + pal2);
        System.out.println("\u001B[33m" + pal3);
        System.out.println("\u001B[37m\u001B[42m" + pal4);
        System.out.println("\u001B[37m\u001B[44m" + pal5);
    }
    
}
