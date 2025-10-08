/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Divisas.Java.pkg1;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class CambioDivisa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca la cantidad de Euros que desea cambiar: ");
            double num = sc.nextDouble();
            System.out.println("Seleccione la divisa a la que desea convertir: ");
            String divisa = sc.next();
            System.out.println("Seleccione la cantidad de Euros que es igual a 1 " + divisa);
            double num2 = sc.nextDouble();
            System.out.println("1 Euro es " + num2 + divisa);
            double cambio = num / num2;
            System.out.println("Sus " + num + " Euros equivalen a: " + cambio + divisa);
    }
    
}
