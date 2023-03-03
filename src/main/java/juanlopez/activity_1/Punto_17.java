/*
 Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud
    de la circunferencia. 
 */
package juanlopez.activity_1;

import java.util.Scanner;

public class Punto_17 {

    public static void main(String[] args) {
        float r, area, lonC;
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese  radio del circulo:");
        r = numero.nextFloat();
        area = (float) (Math.PI * (r * r));
        lonC = (float) (Math.PI * (2 * r));
        
        System.out.println("El area del circulo es: " + area + " metros al cuadrado");
        System.out.println("La longitud de la circunferencia es: " + lonC +" metros");
  

    }

}
