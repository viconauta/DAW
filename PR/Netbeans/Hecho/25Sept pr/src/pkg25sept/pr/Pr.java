/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25sept.pr;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class Pr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
            System.out.println("Seleccione un numero");
                int num = sc.nextInt();
            System.out.println("Seleccione el segundo numero");
                int num2 = sc.nextInt();
                    int suma = num + num2;
                    int resta = num - num2;
                    int multiplicacion = num * num2;
                    int division = num / num2;
                    int resto = num % num2;
            System.out.println(num + " + " + num2 + " = " + suma);
            System.out.println(num + " - " + num2 + " = " + resta);
            System.out.println(num + " * " + num2 + " = " + multiplicacion);
            System.out.println(num + " / " + num2 + " = " + division + " Resto: " + resto);
            System.out.println("El resto de " + num + " / " + num2 + " = " + resto);
            
           
       
    }
    
}
