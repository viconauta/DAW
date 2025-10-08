/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumen.esfera;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class VolumenEsfera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            final double PI = 3.1416;
            System.out.println("Ingrese el radio de la esfera de la que quiere obtener el volumen:");
            double radio = sc.nextDouble();
            double formula = (radio*radio*radio)*PI*4/3;
            System.out.print("El volumen de la esfera es: " + formula);
    }
    
}
