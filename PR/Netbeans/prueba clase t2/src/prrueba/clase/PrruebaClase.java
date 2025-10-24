/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prrueba.clase;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class PrruebaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            /*System.out.println("¿Que hora es?");
            int num = sc.nextInt();
                int hora = num;
                if(hora <=5){
                    System.out.println("Deberias ir a dormir retrasado");
                        } 
                else if(hora < 12){
                    System.out.println("Buenos dias");
                }
                else if(hora < 20){
                    System.out.println("Buenas tardes");
                }
                else if(hora <= 24){
                    System.out.println("Buenas noches");
                }
                else{
                    System.out.println("Esa hora no existe inutil de mierda");
                }
            System.out.println("¿Que dia de la semana es (1 al 7)");
            int dia = sc.nextInt();
                if (dia == 1){
                    System.out.println("Lunes");
                }
                else if (dia == 2){
                    System.out.println("Martes");
                }
                else if (dia == 3){
                    System.out.println("Miercoles");
                }
                else if (dia == 4){
                    System.out.println("Jueves");
                }
                else if (dia == 5){
                    System.out.println("Viernes");
                }
                else if (dia == 6){
                    System.out.println("Sabado");
                }
                else if (dia == 7){
                    System.out.println("Domingo");
                }*/
            /*switch(dia){
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default: 
                    System.out.println("No existe ese dia");
                    break;
            }*//*
            //Calculadora + con if else
            System.out.println("Bienvenido a la calculadora de vico");
            System.out.println("Introduzca los numeros que quiere utilizar para las operaciones:");
            double num = sc.nextInt();
            double num2 = sc.nextInt();
            //mensaje panel de opciones
            System.out.println("Selecione la operacion que desar realizar:");
            System.out.println("1 para la suma (+)");
            System.out.println("2 para la resa (-)");
            System.out.println("3 para la multiplicacion (*)");
            System.out.println("4 para la division (/)");
            System.out.println("5 para el resto de la division (%)");
            //calculos
            double suma = num + num2;
            double resta = num - num2;
            double mult = num * num2;
            double div = num / num2;
            double resto = num % num2;
            //panel de opciones con switch
            int op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.println(num + " + " + num2 + " = " + suma);
                    break;
                case 2:
                    System.out.println(num + " - " + num2 + " = " + resta);
                    break;
                case 3:
                    System.out.println(num + " * " + num2 + " = " + mult);
                    break;
                case 4:
                    System.out.println(num + " / " + num2 + " = " + div);
                    break;
                case 5:
                    System.out.println(num + " % " + num2 + " = " + resto);
                    break;
                default:
                    System.out.println("Esa cuenta no es valida inutil de mierda");
                    break;*/
            /*System.out.println("Introduce un numero entre 1 y 10");
                int num = sc.nextInt();
                boolean numvalid = num > 1 && num < 10;
                while(!numvalid){
                    System.out.println("Ese numero no es valido subnormal, entre 1 y 10 espabilao");
                    num = sc.nextInt();
                    numvalid = num > 1 && num < 10;
                }
                System.out.println("El numero es " + num);*/
                //Calculadora ++ con bucle
                /*System.out.println("Bienvenido a la calculadora de vico pusle cualquier valor del 1 al 9 para empezar");
                int selector = sc.nextInt();
                boolean numvalid = selector >= 0 && selector <= 9;
                while(numvalid)    
                {
                    System.out.println("Introduzca los numeros que quiere utilizar para las operaciones:");
                    double num = sc.nextInt();
                    double num2 = sc.nextInt();
                    //mensaje panel de opciones
                    System.out.println("Selecione la operacion que desar realizar:");
                    System.out.println("Pulsa 1 para la suma (+)");
                    System.out.println("Pulsa 2 para la resa (-)");
                    System.out.println("Pulsa 3 para cambiar los valores");
                    System.out.println("Pulsa 4 para salir");
                    selector = sc.nextInt();
                    numvalid = selector >=1 && selector <=3;
                    //calculos
                    double suma = num + num2;
                    double resta = num - num2;
                    //valores switch
                    switch(selector){
                        case 1:
                            System.out.println(num + " + " + num2 + " = " + suma);
                            System.out.println("Pulsa 3 para cambiar los valores");
                            System.out.println("Pulsa 4 para salir");
                            selector = sc.nextInt();
                            numvalid = selector >=1 && selector <=3;
                            break;
                        case 2:
                            System.out.println(num + " - " + num2 + " = " + resta);
                            System.out.println("Pulsa 3 para cambiar los valores");
                            System.out.println("Pulsa 4 para salir");
                            selector = sc.nextInt();
                            numvalid = selector >=1 && selector <=3;
                            break;
                        case 3:
                            System.out.println("Redirigiendo a la pagina de seleccion");
                            break;
                        case 4:
                            System.out.println("Ha salido del sistema");
                            break;
                        default:
                            System.out.println("El valor no es correcto, vuelva a intentarlo");
                            System.out.println("Pulsa 3 para cambiar los valores");
                            System.out.println("Pulsa 4 para salir");
                            selector = sc.nextInt();
                            numvalid = selector >=1 && selector <=3;
                            break;
                    }
                    System.out.println("Gracias por utilizar la calculadora de viconauta, vuelva pronto");
                }*/
            //Suma de pares
            System.out.println("Introduce 2 numeros:");
            int num = sc.nextInt();
            int num2 = sc.nextInt();
            int suma = 0;
            //bucle
            for(int i = num; i <= num2; i++){
                int resultado = i % 2;
                if(resultado == 0){
                    suma += i;
                }
                //impresion en pantalla del resultado
                System.out.println("La suma es: " + suma);
            }
                  
            System.out.println("Cambio Pablo");
        }
    }
    

