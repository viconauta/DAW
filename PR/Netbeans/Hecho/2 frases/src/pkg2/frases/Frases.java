/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.frases;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class Frases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca 2 frases:");
            String frase1 = sc.nextLine();
            String frase2 = sc.nextLine();
            String frase3 = sc.nextLine();
                int longitud1 = frase1.length();
                int longitud2 = frase2.length();
                int longitud3 = frase3.length();
                
                boolean resultado1 = longitud1 == longitud2;
                boolean resultado2 = longitud1 > longitud2;
                boolean resultado3 = longitud1 < longitud2;
                boolean resultado4 = longitud2 >= longitud2;
                boolean resultado5 = longitud1 != longitud3;
                System.out.println(resultado1);
                System.out.println(resultado2);
                System.out.println(resultado3);
                System.out.println(resultado4);
                System.out.println(resultado5);
    }
    
}
