/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigo.secreto;
import java.util.Scanner;
/**
 *
 * @author anton
 */
public class CodigoSecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            //introducir datos
            System.out.println("EScriba un numero de 4 cifras:");
            int num = sc.nextInt(); //numero
            sc.nextLine();
            System.out.println("Introduzca una palabra de 3 letras:");
            String palabra = sc.nextLine(); //palabra
            
            //1er numero
            int num1 = num / 1000; // 3333 / 1000 = 3 - primer numero
            int mult = num1 * 1000; // 3 *1000 = 3000
            int res = num - mult; // 3333 - 3000 = 333
            //2do numero
            int num2 = res / 100; // 333 / 100 = 3 - segundo numero
            int mult2 = num2 * 100; // 3 * 100 = 300
            int res2 = res - mult2; // 333 - 300 = 33
            //3er y 4to numero
            int num3 = res2 / 10; // 33 / 10 = 3 - tercer numero
            int mult3 = num3 * 10; // 3 * 10 = 30
            int num4 = res2 - mult3; // 33 - 30 = 3 - cuarto numero
            
            //palabra invertida
            char var1 = palabra.charAt(0);
            char var2 = palabra.charAt(1);
            char var3 = palabra.charAt(2);
            
            //ejecucion
            int suma = num1 + num2 + num3 + num4; //suma de las cifras
            int multi = num1 * num4; // multiplicacion 1ra y ultima cifra
            
            //impresion
            System.out.println("" + suma + var3 + var2 + var1 + multi);
    }
    
}
