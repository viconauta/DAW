/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precio.gasolina.pkg1;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class PrecioGasolina1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el total de kms recorridos:");
        double km = sc.nextDouble(); //total de kms recorridos
        System.out.println("Indique el precio por litro de combustible:");
        double gas = sc.nextDouble(); //precio litro de combustible
        System.out.println("Escriba la cantidad total de dinero en Euros que ha gastado en combustible para el viaje:");
        double gas1 = sc.nextDouble(); //dinero total de combustible
        System.out.println("Ingrese la cantidad total del tiempo que ha tardado en completar el viaje:");
        System.out.println("Horas:");
        int hora =sc.nextInt(); //horas de viaje
        System.out.println("minutos:");
        double minuto =sc.nextInt(); //minutos de viaje
            double litro = gas1 / gas; //cantidad de litros de combustible
            double lkm = litro / km; //litros/km
            double ekm = gas1 / km; //euros/km
            //conversion a km/h y a m/s
            double var1 = minuto / 60; //minutos a horas
            double var2 = hora * 60 * 60; //horas a segundos
            double var3 = minuto * 60; //minutos a segundos
            double var4 = km * 1000; //kms a metros
            double horas = hora + var1 ; //suma para horas 
            double segundo = var2 + var3; //sema para segundos
        System.out.println("Su consumo de combustible ha sido de " + lkm * 100 + " litros y " + ekm * 100 + "Euros cada 100kms");
        System.out.println("Por cada km su vehiculo a consumido " + lkm + " litros y " + ekm + "Euros");
        System.out.println("Velocidad media en km/h: " + km / horas);
        System.out.println("Velocidad media en m/s: " + var4 / segundo);
    }
    
}
