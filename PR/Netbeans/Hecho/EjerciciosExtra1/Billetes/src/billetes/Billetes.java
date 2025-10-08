/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billetes;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class Billetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca un numero");
            int num = sc.nextInt();
            //billete 200
            int billete200 = num / 200;
            int resto200 = num % 200;
            //billete 100
            int billete100 = resto200 / 100;
            int resto100 = resto200 % 100;
            //billete 50
            int billete50 = resto100 / 50;
            int resto50 = resto100 % 50;
            //billete 20
            int billete20 = resto50 / 20;
            int resto20 = resto50 % 20;
            //billete 10
            int billete10 = resto20 / 10;
            int resto10 = resto20 % 10;
            //billete 5
            int billete5 = resto10 / 5;
            int resto5 = resto10 % 5;
            //moneda 2
            int moneda2 = resto5 / 2;
            int resto2 = resto5 % 2;
            //moneda 1
            int moneda1 = resto2 / 1;
                //impresion en pantalla del resultado
                System.out.println("Billetes de 200: " + billete200);
                System.out.println("Billetes de 100: " + billete100);
                System.out.println("billetes de 50; " + billete50);
                System.out.println("Billetes de 20: " + billete20);
                System.out.println("Billetes de 10: " + billete10);
                System.out.println("Billetes de 5: " + billete5);
                System.out.println("Monedas de 2: " + moneda2);
                System.out.println("Monedas de 1: " + moneda1);
                
    }
    
}
