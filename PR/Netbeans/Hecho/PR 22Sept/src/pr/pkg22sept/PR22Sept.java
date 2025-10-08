/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr.pkg22sept;
import java.util.Scanner;

/**
 *
 * @author EAG
 */
public class PR22Sept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Hola Mundo Cruel");
        /*String nombre = "Pedro";
        System.out.println("Hola " + nombre);    
        final int EDAD = 30;
        int numero1 = 20, numero2 = 5, numero3 = 7;
                int suma = numero1 + numero3;
                int sumaIncrementada = ++suma;
                System.out.println("Suma numero1 + numero2: " + sumaIncrementada);
                int resta = numero2 - numero3;
                System.out.println("Resta numero2 + numero3: " + resta);   
        
        boolean ver = true;
        boolean ver1 = true; 
        boolean fal = false;
        boolean fal1 = false;
        
        boolean expresion = ver && ver1;
        System.out.println("ver and ver1 " + expresion);
        expresion = ver && fal1;
        System.out.println("ver and fal1 " + expresion);
        expresion = ver || fal;
        System.out.println("ver || fal " + expresion);
        expresion = !ver;
        System.out.println("not ver " + expresion);
        
        //Operadores de asignacion
        int num1, num2, num3;
        num1 = 5;
        num2 = 3;
        num3 = 12;
        
        int result = 1;
        System.out.println(result);
        result += num1;
        System.out.println(result);
        
        num3 -= num2;
        System.out.println("num3 " + num3);
        num3 -= num2;
        System.out.println("num3 " + num3);
        int num1, num2, num3, num4;
        num1 = 5;
        num2 = 3;
        num3 = 15;
        num4 = 3;
        boolean result;
        result = num1 < num2;
        System.out.println(num1 + " es menor que " + num2 + " : " + result);
        result = num1 > num2;
        System.out.println(num1 + " es mayor que " + num2 + " : " + result);
        result = num2 >= num4;
        System.out.println(num2 + " es mayor o igual que " + num4 + " : " + result);
        result = num1 == num2;
        System.out.println(num1 + " es igual que " + num2 + " : " + result);
        
        System.out.println("num3 antes " + num3);
        num3 %= num1;
        System.out.println("num3 despues " + num3);
        int num1 = 5, num2 = 7;
                boolean expresion;
                expresion = (num1 * num2 * num2) > (num1++ / num1);
                System.out.println("El resultado es: " + expresion);*/
        Scanner escanerEntrada = new Scanner(System.in);
        int num1;
        System.out.println("Introduce un numero: ");
        num1 = escanerEntrada.nextInt();
        System.out.println("He introducido: " + num1);
        
    }
    
}
