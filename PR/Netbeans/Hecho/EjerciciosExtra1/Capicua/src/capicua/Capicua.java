/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capicua;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class Capicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca un numero de 3 cifras:");
            int num = sc.nextInt();
                //cuentas
                int num1 = num / 100;   //333/100=3
                int num2 = num1 * 100;  //3*100=300
                int res1 = num - num2;  //333-300=33
                int res2 = res1 / 10;   //33/10=3
                int num4 = res2 * 10;   //3*10=30
                int res3 = res1 - num4; //33-30=3
                    //booleanos
                    boolean capicua = num1 == res2;
                    boolean capicua2 = num1 == res3;
                    boolean capicua3 = capicua && capicua2;
                System.out.println(capicua3);
               
                
                
                
            
    }
    
}
