/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.al.reves;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class NumerosAlReves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Escriba un numero de 4 cifras:");
            int num = sc.nextInt();
            //cuentas 1er numero
            int var = num / 1000; // 3333 / 1000 = 3 (primer numero)
            int mult = var * 1000; // 3 * 1000 = 3000
            int num2 = num - mult; // 3333 - 3000 = 333
            //cuentas 2do numero
            int var2 = num2 /100; // 333 / 100 = 3 (segundo numero)
            int mult2 = var2 * 100; // 3 * 100 = 300
            int num3 = num2 - mult2; //333 - 300 = 33
            //cuentas 3er y 4to numero
            int var3 = num3 / 10; // 33 / 10 = 3 (tercer numero)
            int mult3 = var3 * 10; // 3 * 10 = 30
            int num4 = num3 - mult3; // 33 - 30 = 3 (cuarto numero)
                //imprimir en pantalla
                System.out.println("" + num4 + var3 + var2 + var);
    }
    
}
