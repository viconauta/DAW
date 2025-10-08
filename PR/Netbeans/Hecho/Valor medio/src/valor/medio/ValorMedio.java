/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valor.medio;
import java.util.Scanner;
/**
 *
 * @author anton
 */
public class ValorMedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el primer numero:");
        int num1 = sc.nextInt();
        System.out.println("Escriba el segundo numero:");
        int num2 = sc.nextInt();
        System.out.println("Escriba el tercer numero:");
        int num3 = sc.nextInt();
        System.out.println("Escriba el cuarto numero:");
        int num4 = sc.nextInt();
            int media = (num1 + num2 + num3 + num4) / 4;
            System.out.println("El valor medio de los numeros " + num1 + ", " + num2 + ", " + num3 + " y " + num4 + " es: " + media);
    }
    
}
