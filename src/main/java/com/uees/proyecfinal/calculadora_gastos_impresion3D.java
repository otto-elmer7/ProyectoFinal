
package com.uees.proyecfinal;

import java.util.InputMismatchException;
import java.util.Scanner;


public class calculadora_gastos_impresion3D {

   
    public static void main(String[] args) {
        
             try {
                String Continuar ="Si";
                while (Continuar.equalsIgnoreCase("Si")){
                Scanner scanner = new Scanner(System.in);
                double filamento, gramos, hora, minuto;
                System.out.println("Introduce el importe del filamento: ($)");
                filamento = scanner.nextDouble();
                System.out.println("Introduce los gramos a utilizar: (g)");
                gramos = scanner.nextDouble();
                System.out.println("Introduce las horas de impresion: ");
                hora = scanner.nextDouble();
                System.out.println("Introduce los minutos de impresion: ");
                minuto = scanner.nextDouble();
                filamento = filamento / 1000; // el rollo de filamento trae 1000g, asi tenemos el precio del gramo
                hora = hora * 0.1923; // 1 hora cuesta 0.1923 lo multiplicamos por las horas de impresion
                minuto = minuto * 0.0032; // 1 hora cuesta 0.1923 lo multiplicamos por las horas de impresion

                double resultado = (filamento * gramos);
                double resultado2 = (hora + minuto);
                double resultado3 = resultado + resultado2;
                System.out.println(
                        "\nEl costo del plastico: " + resultado
                        + "\nEl costo de  electricidad:  " + resultado2
                        + "\n¿Necesitas mas de un rollo de filamento? -> " + (gramos > 1000)
                        + "\n\nEl costo de la pieza es: " + resultado3);
                
               System.out.println("¿Desea continuar? (Si/No)");
               Continuar=scanner.next();
            }
               
                
            } catch (InputMismatchException ex) {
                System.out.println("Debe ingresar por obligacion un numero entero");
            }
              
                   
    }
         
}
            
    

    
    

