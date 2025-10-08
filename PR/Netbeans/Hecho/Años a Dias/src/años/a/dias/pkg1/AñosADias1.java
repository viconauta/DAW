/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package años.a.dias.pkg1;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class AñosADias1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad:");
        int edad = sc.nextInt();
        int num = edad * 365;
        System.out.println("Su edad es: " + num + " dias ");
    }
    
}
